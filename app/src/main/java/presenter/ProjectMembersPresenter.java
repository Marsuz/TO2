package presenter;


import controllers.ProjectMembersOverviewController;
import interfaces.modules.IProjectsSource;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import projectsmodel.Project;

import java.io.IOException;

public class ProjectMembersPresenter {

    private Stage primaryStage;

    private IProjectsSource source;

    public ProjectMembersPresenter(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void setProjectsSource(IProjectsSource source){
        this.source = source;
    }

    /*public void initRootLayout() {
        try {
            this.primaryStage.setTitle("ProjectMembers");

            // load layout from FXML file
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("../view/ProjectMembersOverview.fxml"));
            BorderPane rootLayout = (BorderPane) loader.load();

            // set initial data into controller
            ProjectMembersOverviewController controller = loader.getController();
            controller.setPresenter(this);
            //controller.setData(new ArrayList<Project>());

            controller.setProject(Project.newProject());

            // add layout to a scene and show them all
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (IOException e) {
            // don't do this in common apps
            e.printStackTrace();
        }

    }*/

}
