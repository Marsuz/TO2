package view;

import presenter.ProjectPresenter;
import projectsmodel.Project;

import java.util.List;

/**
 * Created by Szymon on 09.12.15.
 */
public class ProjectOverviewController {

    private List<Project> data;

    private ProjectPresenter presenter;

    public void setData(List<Project> projects) {
        this.data = projects;
        //projectsTable.setItems(data);
    }

    public void setPresenter(ProjectPresenter presenter) {
        this.presenter = presenter;
    }


}
