package presenter;

import controllers.ProjectEditDialogController;
import controllers.ProjectMembersOverviewController;
import interfaces.modules.IProjectsSource;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import projectsmodel.Project;
import controllers.ProjectOverviewController;

import java.io.IOException;

public class ProjectPresenter {

    private Stage primaryStage;

    private IProjectsSource source;

    public ProjectPresenter(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void setProjectsSource(IProjectsSource source){
        this.source = source;
    }

    public void initRootLayout() {
        try {
            this.primaryStage.setTitle("Projects");

            // load layout from FXML file
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("../view/ProjectOverview.fxml"));
            BorderPane rootLayout = (BorderPane) loader.load();

            // set initial data into controller
            ProjectOverviewController controller = loader.getController();
            controller.setPresenter(this);
            controller.setData(source);

            // add layout to a scene and show them all
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (IOException e) {
            // don't do this in common apps
            e.printStackTrace();
        }

    }

    public boolean showProjectEditDialog(Project project) {
        try {
            // Load the fxml file and create a new stage for the dialog
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("../view/ProjectEditDialog.fxml"));
            BorderPane page = (BorderPane) loader.load();

            // Create the dialog Stage.
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Project");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(primaryStage);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);

            // Set the person into the controller.
            ProjectEditDialogController controller = loader.getController();
            controller.setDialogStage(dialogStage);
            controller.setData(project);

            // Show the dialog and wait until the user closes it
            dialogStage.showAndWait();
            return controller.isApproved();

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }



}
