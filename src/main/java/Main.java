import model.*;

import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Wireman("Vasya", "Pupkin", "Petrovich", Positions.Wireman,
                new BigDecimal(50000), Departments.WorkShop));
        employees.add(new Wireman("Petya", "Vasechkin", "Abdulaevich", Positions.Wireman,
                new BigDecimal(30000), Departments.Warehouse));
        employees.add(new Quarry("Abdulla", "Yarullin", "Ahmetovich", Positions.Quarry,
                new BigDecimal(60000), Set.copyOf(Arrays.asList(1, 2, 3))));
        employees.add(new Quarry("Abdulla", "Yarullin", "Ahmetovich", Positions.Quarry,
                new BigDecimal(40000), Set.copyOf(Arrays.asList(2))));
        employees.add(new Developer("Sergio", "del Amo", "Amo", Positions.Developer,
                new BigDecimal(100000), "PHP", "KNRTU"));
        employees.add(new JavaDeveloper("Almaz", "Garaev", "Rishatovich", Positions.Developer,
                new BigDecimal(180000), 1, "IntelliJIdea"));

        System.out.println("There are all employees:");
        System.out.println(employees);

        Set<Employee> sortedList = new TreeSet<>(new CompareEmployeeSalaries());
        sortedList.addAll(employees);
        System.out.println("");
        System.out.println("There are sorted by salary employee list:");
        System.out.println("");
        System.out.println(sortedList);

        System.out.println("");
        System.out.println("There are Newton's laws:");
        for (Employee employee : employees) {
            if (employee.getPosition() == Positions.Quarry) {
                System.out.println("");
                System.out.println(employee.getInfomation());
                Quarry quarry = (Quarry) employee;
                System.out.println(quarry.getNewtonLaws());
            }

        }
    }
}
