package controllers;


import javafx.fxml.FXML;
import javafx.scene.control.*;
import othersmodel.Employee;
import othersmodel.Salary;
import othersmodel.Team;
import othersmodel.TeamMember;
import presenter.ProjectMembersPresenter;
import projectsmodel.Project;

import java.math.BigDecimal;

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
    private TreeTableView<String> membersTable;

    @FXML
    private TreeTableColumn<String, String> firstNameColumn;

    @FXML
    private TreeTableColumn<String, String> lastNameColumn;

    @FXML
    private TreeTableColumn<String, String> occupationColumn;

    @FXML
    private Button deleteTeamButton;

    @FXML
    private Button addTeamButton;

    @FXML
    private void initialize() {

        membersTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        //membersTable.setCellValueFactory(dataValue -> dataValue.getValue().getNameProperty());

        Team team = new Team();
        team.setName("team1");
        Team team2 = new Team();
        team.setName("team2");
        loadTreeItems(new TeamMember(team, new Employee(1, "Marek", "Marek", new Salary(BigDecimal.ZERO), "occ")),
                new TeamMember(team, new Employee(2, "Darek", "Marek", new Salary(BigDecimal.ZERO), "occ")),
                new TeamMember(team2, new Employee(3, "Jarek", "Marek", new Salary(BigDecimal.ZERO), "occ"))
                );
    }


    public void setProject(Project project) {
        /*this.project = project;
        teamsTable.getItems().setAll(project.getTeams());*/
    }

    public void loadTreeItems(TeamMember... members) {
        TreeItem<String> root = new TreeItem<>("Root Node");
        root.setExpanded(true);
        /*for (String itemString: rootItems) {
            root.getChildren().add(new TreeItem<>(itemString));
        }*/

        /*for (TeamMember member : members) {
            TreeItem<String> empLeaf = new TreeItem<String>(member.getEmployee().getFirstName());
            boolean found = false;
            for (TreeItem<String> depNode : rootNode.getChildren()) {
                if (depNode.getValue().contentEquals(employee.getDepartment())){
                    depNode.getChildren().add(empLeaf);
                    found = true;
                    break;
                }
            }
            if (!found) {
                TreeItem<String> depNode = new TreeItem<String>(
                        employee.getDepartment()
                );
                rootNode.getChildren().add(depNode);
                depNode.getChildren().add(empLeaf);
            }
        }*/

        membersTable.setRoot(root);
    }


}
