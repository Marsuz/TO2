package projectsmodel;

import interfaces.ITeam;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.joda.time.DateTime;
import othersmodel.Team;
import othersmodel.TeamMember;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

public class Project {

    private long projectId;
    private StringProperty name;
    private ObservableList<ITeam> teams;
    private Map<TeamMember, String> memberRoleMap;
    private ObjectProperty<LocalDate> startDate;
    private ObjectProperty<LocalDate> endDate;
    private ObjectProperty<BigDecimal> budget;

    private Project() {
        this(0, "", LocalDate.now(), LocalDate.now(), BigDecimal.ZERO);
    }

    public Project(long projectId, String name, LocalDate startDate, LocalDate endDate, BigDecimal budget) {
        this.projectId = projectId;
        this.name = new SimpleStringProperty(name);
        this.teams = FXCollections.observableArrayList();
        this.memberRoleMap = new HashMap<>();
        this.startDate = new SimpleObjectProperty<>(startDate);
        this.endDate = new SimpleObjectProperty<>(endDate);
        this.budget = new SimpleObjectProperty<>(budget);
    }

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    public String getName() {
        return name.getValue();
    }

    public void setName(String name) {
        this.name.setValue(name);
    }

    public StringProperty getNameProperty(){
        return name;
    }

    public List<ITeam> getTeams() {
        return teams;
    }

    public void setTeams(ObservableList<ITeam> teams) {
        this.teams = teams;
    }

    public Map<TeamMember, String> getMemberRoleMap() {
        return memberRoleMap;
    }

    public void setMemberRoleMap(Map<TeamMember, String> memberRoleMap) {
        this.memberRoleMap = memberRoleMap;
    }

    public LocalDate getStartDate() {
        return startDate.getValue();
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate.setValue(startDate);
    }

    public ObjectProperty<LocalDate> getStartDateProperty(){
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate.getValue();
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate.setValue(endDate);
    }

    public ObjectProperty<LocalDate> getEndDateProperty(){
        return endDate;
    }

    public BigDecimal getBudget() {
        return budget.getValue();
    }

    public void setBudget(BigDecimal budget) {
        this.budget.setValue(budget);
    }

    public ObjectProperty<BigDecimal> getBudgetProperty(){
        return budget;
    }

    public void addTeam(ITeam team) {
        teams.add(team);
    }

    public void removeTeam(ITeam team) {
        teams.remove(team);
    }

    public void addRole(TeamMember teamMember, String role) {
        memberRoleMap.put(teamMember, role);
    }

    public static Project newProject() {
        return new Project();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Project project = (Project) o;

        if (projectId != project.projectId) return false;
        if (!name.equals(project.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (projectId ^ (projectId >>> 32));
        result = 31 * result + name.hashCode();
        return result;
    }
}
