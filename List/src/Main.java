import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Using List.of() to create an ArrayList (Java 9 and later)
        ArrayList<String> list1 = new ArrayList<>(List.of("apple", "banana", "orange"));

        // Using Arrays.asList() to create an ArrayList
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("apple", "banana", "orange"));

        System.out.println("ArrayList 1: " + list1);
        System.out.println("ArrayList 2: " + list2);

        // Modifying the original list from Arrays.asList() will affect the ArrayList
        List<String> asList = Arrays.asList("one", "two", "three");
        ArrayList<String> list3 = new ArrayList<>(asList);
        System.out.println("ArrayList 3 (before modification): " + list3);
        asList.set(0, "modified");
        System.out.println("ArrayList 3 (after modification): " + list3); // Modified value will reflect in list3
    }
}