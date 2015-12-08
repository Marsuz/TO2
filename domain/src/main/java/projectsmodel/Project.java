package projectsmodel;

import org.joda.time.DateTime;
import othersmodel.Employee;
import othersmodel.Team;
import othersmodel.Employee;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Marcin on 2015-12-08.
 */
public class Project {

    private long projectId;
    private String name;
    private Employee keeper;
    private List<Team> teams;
    private DateTime startDate;
    BigDecimal time;
    BigDecimal budget;

    public Project(long projectId, String name, Employee leader, List<Team> teams, DateTime startDate, BigDecimal time, BigDecimal budget) {
        this.projectId = projectId;
        this.name = name;
        this.keeper = keeper;
        this.teams = teams;
        this.startDate = startDate;
        this.time = time;
        this.budget = budget;
    }

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getkeeper() {
        return keeper;
    }

    public void setkeeper(Employee keeper) {
        this.keeper = keeper;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public BigDecimal getTime() {
        return time;
    }

    public void setTime(BigDecimal time) {
        this.time = time;
    }

    public BigDecimal getBudget() {
        return budget;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }
}
