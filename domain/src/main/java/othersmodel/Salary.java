package othersmodel;

import interfaces.ISalary;

import java.math.BigDecimal;

/**
 * Created by Marcin on 2015-12-08.
 */
public class Salary implements ISalary {

    private BigDecimal salary;

    public Salary(BigDecimal salary) {
        this.salary = salary;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
