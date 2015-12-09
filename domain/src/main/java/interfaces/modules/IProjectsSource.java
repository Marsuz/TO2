package interfaces.modules;

import javafx.collections.ObservableList;
import projectsmodel.Project;


public interface IProjectsSource {
    ObservableList<Project> getProjects();
}
