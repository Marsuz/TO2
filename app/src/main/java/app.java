/**
 * Created by Marcin on 2015-12-08.
 */


import othersmodel.Employee;
import othersmodel.Salary;

import java.math.BigDecimal;

public class app {

    public static void main(String[] args) {

        Employee emp = new Employee(1, "Marcin", "Zajda", new Salary(new BigDecimal(5000)), "Junior Developer");

        System.out.println(emp.getOccupation());

    }
}
