import java.math.BigDecimal;
import java.util.*;

public class Test {
    public List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

    }

    public void init() {

        employees.add(new Wireman("Vasya", "Pupkin", "Petrovich", Positions.Wireman,
                new BigDecimal(5000000), Departments.WorkShop));
        employees.add(new Wireman("Petya", "Vasechkin", "Abdulaevich", Positions.Wireman,
                new BigDecimal(3000000), Departments.Warehouse));
        employees.add(new Quarry("Abdulla","Yarullin","Ahmetovich",Positions.Quarry,
                new BigDecimal(6000000), Set.copyOf(Arrays.asList(1, 2, 3))));
        employees.add(new Quarry("Abdulla","Yarullin","Ahmetovich",Positions.Quarry,
                new BigDecimal(4000000), Set.copyOf(Arrays.asList(2))));
        employees.add(new Developer("Sergio","del Amo","Amo",Positions.Developer,
                new BigDecimal(10000000),"PHP","KNRTU"));
        employees.add(new JavaDeveloper("Sergio","del Amo","Amo",Positions.Developer,
                new BigDecimal(18000000),1,"IntelliJIdea"));
    }

    public Set sortedEmployees() {

        Set<Employee> sortedList = new TreeSet<>(new CompareEmployeeSalaries());
        sortedList.addAll(employees);
        return sortedList;
    }

    private enum Positions {
        Wireman(0),
        ElectronicsEngineer(1),
        Developer(2),
        Quarry(3);
        private int positionNumber;

        Positions(int positionNumber) {

            this.positionNumber = positionNumber;
        }
    }

    private enum Departments {
        WorkShop(0),
        Warehouse(1);
        private int departmentNumber;

        Departments(int departmentNumber) {

            this.departmentNumber = departmentNumber;
        }
    }

    static class CompareEmployeeSalaries implements Comparator<Employee> {

        @Override
        public int compare(Employee employee1, Employee employee2) {

            return employee1.getSalary().compareTo(employee2.getSalary());
        }
    }

    class Employee {
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

    class Wireman extends Employee {
        private Departments department;

        public Wireman(String name, String surname, String middleName, Positions position, BigDecimal salary,
                       Departments department) {

            super(name, surname, middleName, position, salary);
            this.department = department;
        }
    }

    class Quarry extends Employee {
        private static final String firstNewtonLaw = "Law of Inertia";
        private static final String secondNewtonLaw = "Law of Mass and Acceleration";
        private static final String thirdNewtonLaw = "Law of Motion";
        private Set<Integer> newtonLawsList;

        public Quarry(String name, String surname, String middleName, Positions position, BigDecimal salary,
                      Set<Integer> newtonLawsList) {

            super(name, surname, middleName, position, salary);
            this.newtonLawsList = newtonLawsList;
        }

        public String getInformation() {

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

    class Developer extends Employee {
        private String programmingLanguage;
        private String university;

        public Developer(String name, String surname, String middleName, Positions position, BigDecimal salary,
                         String programmingLanguage, String university) {

            super(name, surname, middleName, position, salary);
            this.programmingLanguage = programmingLanguage;
            this.university = university;
        }
    }

    class JavaDeveloper extends Employee {
        private int javaExperience;
        private String ide;

        public JavaDeveloper(String name, String surname, String middleName, Positions position, BigDecimal salary,
                             int javaExperience, String ide) {

            super(name, surname, middleName, position, salary);
            this.javaExperience = javaExperience;
            this.ide = ide;
        }
    }
}
