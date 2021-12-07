package model;

import java.math.BigDecimal;

public class Developer extends Employee {
    private String programmingLanguage;
    private String university;

    public Developer(String name, String surname, String middleName, Positions position, BigDecimal salary,
                     String programmingLanguage, String university) {

        super(name, surname, middleName, position, salary);
        this.programmingLanguage = programmingLanguage;
        this.university = university;
    }
}