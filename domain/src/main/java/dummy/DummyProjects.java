package dummy;

import interfaces.IProjectsSource;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import projectsmodel.Project;

import java.math.BigDecimal;
import java.time.LocalDate;

public class DummyProjects implements IProjectsSource {

    private ObservableList<Project> projects = FXCollections.observableArrayList();

    public DummyProjects(){
        projects.add(new Project(1, "AirBerlin", LocalDate.of(2015, 8, 24), LocalDate.of(2015, 9, 14), BigDecimal.valueOf(27000L)));
        projects.add(new Project(2, "Lufthansa", LocalDate.of(2016, 6, 9), LocalDate.of(2017, 1, 18), BigDecimal.valueOf(50000L)));
        projects.add(new Project(3, "LOT", LocalDate.of(2015, 1, 12), LocalDate.of(2016, 3, 1), BigDecimal.valueOf(100000L)));
        projects.add(new Project(4, "WizzAir", LocalDate.of(2015, 9, 9), LocalDate.of(2015, 12, 30), BigDecimal.valueOf(15000L)));

    }

    @Override
    public ObservableList<Project> getProjects() {
        return projects;
    }
}
