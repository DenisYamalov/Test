package model;

import java.math.BigDecimal;

public class Wireman extends Employee {
    private Departments department;

    public Wireman(String name, String surname, String middleName, Positions position, BigDecimal salary,
                   Departments department) {

        super(name, surname, middleName, position, salary);
        this.department = department;
    }
}