import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//  Empty ArrayList of type String assign it to a list local variable
        List<String> list = new ArrayList<>();

        List<String> list1 = new ArrayList<>(List.of(
                "Rocket", "Tim", "Stark", "Peter", "Steve",
                "Anna", "Bob", "Carol", "David", "Edna"
        ));

        String[] names = {"Anna", "Bob", "Carol", "David", "Edna"};
        String[] names1 = {"Rocket", "Tim", "Stark", "Peter", "Steve"};
        list.addAll(Arrays.asList(names));
        list.addAll(Arrays.asList(names1));
        list.add("Harry");
        list1.add("Harry");
        list1.addAll(List.of("Alice", "Pegasus", "Nami"));
        Collections.sort(list);
        Collections.sort(list1);

        System.out.println("Has Steve ? " + list.contains("Steve"));
        System.out.println("list list.addAll() : " + list);
        System.out.println("list1 List.of() : " + list1);

        System.out.println();
//        remove
        list.removeIf(s -> s.charAt(0) == 'S');
        System.out.println("Has Steve ? " + list.contains("Steve"));
        System.out.println("list list.addAll() : " + list);
        System.out.println("list1 List.of() : " + list1);

    }
}