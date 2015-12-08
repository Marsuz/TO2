package presenter;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import projectsmodel.Project;
import view.ProjectOverviewController;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Szymon on 09.12.15.
 */
public class ProjectPresenter {

    private Stage primaryStage;

    public ProjectPresenter(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void initRootLayout() {
        try {
            this.primaryStage.setTitle("Projects");

            // load layout from FXML file
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("../view/ProjectOverviewPane.fxml"));
            BorderPane rootLayout = (BorderPane) loader.load();

            // set initial data into controller
            ProjectOverviewController controller = loader.getController();
            controller.setPresenter(this);
            controller.setData(new ArrayList<Project>());

            // add layout to a scene and show them all
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (IOException e) {
            // don't do this in common apps
            e.printStackTrace();
        }

    }

}
