package model;

import model.Positions;

import java.math.BigDecimal;

public class Employee {
    private String name;
    private String surname;
    private String middleName;
    private Positions position;
    private BigDecimal salary;

    public Employee() {

    }

    public Employee(String name, String surname, String middleName, Positions position, BigDecimal salary) {

        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.position = position;
        this.salary = salary;
    }

    public String getInfomation() {

        return toString();
    }

    public String getNames() {

        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", middleName='" + middleName +
                '}';
    }

    public BigDecimal getSalary() {

        return salary;
    }

    public Positions getPosition() {

        return position;
    }

    @Override
    public String toString() {

        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", middleName='" + middleName + '\'' +
                ", position=" + position +
                ", salary=" + salary +
                '}';
    }
}
