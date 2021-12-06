package model;

import model.Employee;
import model.Positions;

import java.math.BigDecimal;

public class JavaDeveloper extends Employee {
    private int javaExperience;
    private String ide;

    public JavaDeveloper(String name, String surname, String middleName, Positions position, BigDecimal salary,
                         int javaExperience, String ide) {

        super(name, surname, middleName, position, salary);
        this.javaExperience = javaExperience;
        this.ide = ide;
    }
}