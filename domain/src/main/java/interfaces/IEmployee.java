package interfaces;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;

public interface IEmployee {
    long getId();
    String getFirstName();
    String getLastName();
    String getOccupation();
    StringProperty getFullNameProperty();
    ObjectProperty getSalaryProperty();

}
