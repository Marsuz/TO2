package othersmodel;

import interfaces.IEmployee;
import interfaces.ITeam;
import interfaces.ITeamMember;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by Marcin on 2015-12-08.
 */
public class TeamMember implements ITeamMember{

    private ITeam team;
    private IEmployee employee;

    public TeamMember(ITeam team, IEmployee employee) {
        this.team = team;
        this.employee = employee;
    }

    public ITeam getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public IEmployee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public ObjectProperty<ITeam> getTeamProperty() {
        return new SimpleObjectProperty<ITeam>(team);
    }
}
