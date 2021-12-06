package model;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

public class Quarry extends Employee {
    private static final String firstNewtonLaw = "Law of Inertia";
    private static final String secondNewtonLaw = "Law of Mass and Acceleration";
    private static final String thirdNewtonLaw = "Law of Motion";
    private Set<Integer> newtonLawsList;

    public Quarry(String name, String surname, String middleName, Positions position, BigDecimal salary,
                  Set<Integer> newtonLawsList) {

        super(name, surname, middleName, position, salary);
        this.newtonLawsList = newtonLawsList;
    }

    public String getNewtonLaws() {

        List<Integer> targetList = List.copyOf(newtonLawsList);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < targetList.size(); i++) {
            if (targetList.get(i) == 1)
                sb.append("\r\n" + firstNewtonLaw);
            if (targetList.get(i) == 2)
                sb.append("\r\n" + secondNewtonLaw);
            if (targetList.get(i) == 3)
                sb.append("\r\n" + thirdNewtonLaw);
        }
        if (sb.length() == 0)
            sb.append("I don't know Newton's laws");
        return sb.toString();
    }
}
