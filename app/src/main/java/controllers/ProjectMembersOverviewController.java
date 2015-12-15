package controllers;


import interfaces.ITeamMember;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import othersmodel.Employee;
import othersmodel.Salary;
import othersmodel.Team;
import othersmodel.TeamMember;
import presenter.ProjectMembersPresenter;
import projectsmodel.Project;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcin on 2015-12-09.
 */
public class ProjectMembersOverviewController {

    private Project project;

    private ProjectMembersPresenter presenter;

    public void setPresenter(ProjectMembersPresenter presenter) {
        this.presenter = presenter;
    }

    @FXML
    private TreeTableView<ITeamMember> membersTable;

    @FXML
    private TreeTableColumn<ITeamMember, String> firstNameColumn;

    @FXML
    private TreeTableColumn<ITeamMember, String> lastNameColumn;

    @FXML
    private TreeTableColumn<ITeamMember, String> occupationColumn;

    @FXML
    private Button deleteTeamButton;

    @FXML
    private Button addTeamButton;

    @FXML
    private void initialize() {

        membersTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        firstNameColumn.setCellValueFactory(
                (TreeTableColumn.CellDataFeatures<ITeamMember, String> param) ->
                        new ReadOnlyStringWrapper(param.getValue().getValue().getEmployee().getFirstName())
        );
        lastNameColumn.setCellValueFactory(
                (TreeTableColumn.CellDataFeatures<ITeamMember, String> param) ->
                        new ReadOnlyStringWrapper(param.getValue().getValue().getEmployee().getLastName())
        );
        occupationColumn.setCellValueFactory(
                (TreeTableColumn.CellDataFeatures<ITeamMember, String> param) ->
                        new ReadOnlyStringWrapper(param.getValue().getValue().getEmployee().getOccupation())
        );

    }


    public void setProject(Project project) {
        List<Team> teams = new ArrayList<>();
        Team team1 = new Team();
        team1.setName("team1");
        team1.addTeamMember(new TeamMember(team1, new Employee(0, "Marek", "Marek", new Salary(BigDecimal.ZERO), "occ")));
        team1.addTeamMember(new TeamMember(team1, new Employee(1, "Darek", "Marek", new Salary(BigDecimal.ZERO), "occ")));
        team1.addTeamMember(new TeamMember(team1, new Employee(2, "Jarek", "Marek", new Salary(BigDecimal.ZERO), "occ")));
        Team team2 = new Team();
        team2.setName("team2");
        team2.addTeamMember(new TeamMember(team2, new Employee(3, "Jan", "Nowak", new Salary(BigDecimal.ZERO), "occ")));
        loadTreeItems(team1, team2);
        /*this.project = project;
        teamsTable.getItems().setAll(project.getTeams());*/
    }


    public void loadTreeItems(Team... rootItems) {
        Employee emp = new Employee();
        emp.setFirstName("Teams");

        TreeItem<ITeamMember> root = new TreeItem<>(new TeamMember(new Team(), emp));
        root.setExpanded(true);

        for (Team team: rootItems) {
            TreeItem<ITeamMember> teamNode = teamAsTreeItem(team);
            root.getChildren().add(teamNode);

            for(ITeamMember member: team.getTeamMembers()){
                TreeItem<ITeamMember> memberNode = new TreeItem<>(member);
                teamNode.getChildren().add(memberNode);
            }

        }

        membersTable.setRoot(root);
    }

    public TreeItem<ITeamMember> teamAsTreeItem(Team team){
        Employee emp = new Employee();
        emp.setFirstName(team.getName());
        return new TreeItem<>(new TeamMember(team, emp));
    }

}
