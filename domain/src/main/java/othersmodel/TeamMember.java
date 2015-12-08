package othersmodel;

/**
 * Created by Marcin on 2015-12-08.
 */
public class TeamMember {

    private Team team;
    private Employee employee;

    public TeamMember(Team team, Employee employee) {
        this.team = team;
        this.employee = employee;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
