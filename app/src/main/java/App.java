import dummy.DummyProjects;
import interfaces.modules.IProjectsSource;
import javafx.application.Application;
import javafx.stage.Stage;
import presenter.ProjectMembersPresenter;
import presenter.ProjectPresenter;

public class App extends Application{

    private Stage primaryStage;

    private ProjectPresenter presenter;

    private IProjectsSource projectsSource = new DummyProjects();

    @Override
    public void start(Stage primaryStage) {

        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Projects");
        this.presenter = new ProjectPresenter(primaryStage);
        this.presenter.setProjectsSource(projectsSource);
        this.presenter.initRootLayout();

    }




    public static void main(String[] args) {
        launch(args);

        /*Employee emp = new Employee(1, "Marcin", "Zajda", new Salary(new BigDecimal(5000)), "Junior Developer");

        System.out.println(emp.getOccupation());*/

    }
}
