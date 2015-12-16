package interfaces;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;

public interface ITeamMember {
    ITeam getTeam();
    IEmployee getEmployee();
    ObjectProperty getTeamProperty();
}
