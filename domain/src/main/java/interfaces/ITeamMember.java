package interfaces;

import javafx.beans.property.ObjectProperty;

public interface ITeamMember {
    ITeam getTeam();
    IEmployee getEmployee();
    ObjectProperty getTeamProperty();
}
