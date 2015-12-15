package othersmodel;

import interfaces.IEmployee;
import interfaces.ISalary;

/**
 * Created by Marcin on 2015-12-08.
 */
public class Employee implements IEmployee{

    private long id;
    private String firstName;
    private String lastName;
    private ISalary salary;
    private String occupation;

    public Employee(){

    }

    public Employee(long id, String firstName, String lastName, ISalary salary, String occupation) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.occupation = occupation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ISalary getSalary() {
        return salary;
    }

    public void setSalary(ISalary salary) {
        this.salary = salary;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
