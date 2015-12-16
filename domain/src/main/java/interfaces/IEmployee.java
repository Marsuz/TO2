package interfaces;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;

import java.math.BigDecimal;

public interface IEmployee {
    long getId();
    String getFirstName();
    String getLastName();
    String getOccupation();
    ISalary getSalary();
    StringProperty getFullNameProperty();
    ObjectProperty getSalaryProperty();

}
