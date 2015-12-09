package interfaces.modules;

import othersmodel.Employee;
import othersmodel.Salary;

public interface IEmployeesSource {
    Salary getEmployeeSalary(Employee employee);
}
