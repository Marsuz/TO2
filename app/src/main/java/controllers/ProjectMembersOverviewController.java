package controllers;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import org.joda.time.DateTime;
import othersmodel.Team;
import othersmodel.TeamMember;
import projectsmodel.Project;

/**
 * Created by Marcin on 2015-12-09.
 */
public class ProjectMembersOverviewController {

    private Project project;

    @FXML
    private TableView<Team> teamsTable;

    @FXML
    private TableView<TeamMember> teamMemberTable;

    @FXML
    private TableColumn<Team, String> teamColumn;

    @FXML
    private TableColumn<TeamMember, String> memberNameColumn;

    @FXML
    private TableColumn<TeamMember, String> memberRoleColumn;

    @FXML
    private TableColumn<TeamMember, DateTime> memberStartDateColumn;

    @FXML
    private TableColumn<TeamMember, DateTime> memberEndDateColumn;

    @FXML
    private Button deleteTeamButton;

    @FXML
    private Button addTeamButton;

    @FXML
    private void initialize() {

        teamsTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);


    }


    public void setProject(Project project) {
        this.project = project;
        teamsTable.getItems().setAll(project.getTeams());
    }



}
