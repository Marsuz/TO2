package controllers;

import interfaces.ITeamMember;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import othersmodel.Team;
import othersmodel.TeamMember;
import presenter.ProjectPresenter;
import projectsmodel.Project;

import java.math.BigDecimal;

/**
 * Created by Marcin on 2015-12-15.
 */
public class ProjectFinancialOverviewController {

    private Project project;
    
    private ProjectPresenter presenter;
    
    @FXML
    private TableView<ITeamMember> membersTable;

    @FXML
    private TableColumn<ITeamMember, String> NameColumn;

    @FXML
    private TableColumn<ITeamMember, String> RoleColumn;

    @FXML
    private TableColumn<ITeamMember, String> TeamColumn;

    @FXML
    private TableColumn<ITeamMember, BigDecimal> SalaryColumn;

    @FXML
    private Button backButton;

    public void setPresenter(ProjectPresenter presenter) {
        this.presenter = presenter;
    }

    public void setProject(Project project) {
        this.project = project;
        ObservableList<ITeamMember> teamMembers = FXCollections.observableArrayList();
        for(Team t : project.getTeams()) {
            for(ITeamMember tm : t.getTeamMembers()) {
                teamMembers.add(tm);
            }
        }
        membersTable.setItems(teamMembers);
    }
    
    public void initialize() {
        membersTable.getSelectionModel().setSelectionMode(
                SelectionMode.MULTIPLE);

        //NameColumn.setCellValueFactory(dataValue -> dataValue.getValue().getEmployee().getFullNameProperty());
        //RoleColumn.setCellValueFactory(dataValue -> new SimpleStringProperty(project.getMemberRoleMap().get(dataValue)));
        //TeamColumn.setCellValueFactory(dataValue -> dataValue.getValue().getTeamProperty());
        //SalaryColumn.setCellValueFactory(dataValue -> dataValue.getValue().getEmployee().getSalaryProperty());
    }

    @FXML
    private void handleBackAction() {

        presenter.goBackToMainPage();

    }

}
