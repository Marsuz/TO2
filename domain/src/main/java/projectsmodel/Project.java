package projectsmodel;

import org.joda.time.DateTime;
import othersmodel.Team;
import othersmodel.TeamMember;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Marcin on 2015-12-08.
 */
public class Project {

    private long projectId;
    private String name;
    private List<Team> teams;
    private Map<TeamMember, String> memberRoleMap;
    private DateTime startDate;
    private DateTime endDate;
    private BigDecimal budget;

    public Project() {}

    public Project(long projectId, String name, DateTime startDate, DateTime endDate, BigDecimal budget) {
        this.projectId = projectId;
        this.name = name;
        this.teams = new ArrayList<Team>();
        this.memberRoleMap = new HashMap<TeamMember, String>();
        this.startDate = startDate;
        this.endDate = endDate;
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

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public Map<TeamMember, String> getMemberRoleMap() {
        return memberRoleMap;
    }

    public void setMemberRoleMap(Map<TeamMember, String> memberRoleMap) {
        this.memberRoleMap = memberRoleMap;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getBudget() {
        return budget;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public void addRole(TeamMember teamMember, String role) {
        memberRoleMap.put(teamMember, role);
    }

}
