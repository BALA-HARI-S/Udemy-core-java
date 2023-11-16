import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(List.of(35,64,11,27));
        Collections.sort(intList);

        for(Integer i : intList){
            System.out.println(" Integers " + i);
        }

        List<Employee> employees = new ArrayList<>( List.of(
                new Employee("Hari", 1001, 2015),
                new Employee("Bala", 1002, 2020),
                new Employee("Ram", 1003, 2019),
                new Employee("Krishna", 1003, 2021)));

//        var comparator = new EmployeeComparator<>();
//        employees.sort(comparator);

        employees.sort(new Employee.EmployeeComparator<>("yearstarted")
                .reversed());

        for (Employee e : employees){
            System.out.println(e);
        }

        System.out.println("store employees\n");

        List<StoreEmployee> storeEmployees = new ArrayList<>( List.of(
                new StoreEmployee("Hari", 1001, 2015, "Walmart"),
                new StoreEmployee("Bala", 1002, 2020, "BB"),
                new StoreEmployee("Ram", 1003, 2019, "Max"),
                new StoreEmployee("Bala", 1002, 2020, "Walmart"),
                new StoreEmployee("Ram", 1003, 2019, "BB"),
                new StoreEmployee("Krishna", 1003, 2021, "Reliance")));

        var comparator = new StoreEmployee().new StoreComparator<>();
        storeEmployees.sort(comparator);
        for(StoreEmployee e: storeEmployees){
            System.out.println(e);
        }
    }
}