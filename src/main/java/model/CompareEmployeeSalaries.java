package model;

import java.util.Comparator;

public class CompareEmployeeSalaries implements Comparator<Employee> {

    @Override
    public int compare(Employee employee1, Employee employee2) {

        return employee1.getSalary().compareTo(employee2.getSalary());
    }
}