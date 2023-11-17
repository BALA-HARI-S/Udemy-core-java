import funint.Operation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    record Person(String firstName, String lastName){
        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
    }
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Main.Person("Bala","Hari"),
                new Person("Linus", "Van Pelt"),
                new Person("Charlie", "Brown")));

        //anonymous class
        var comparatorLastName = new Comparator<Person>(){

            @Override
            public int compare(Person o1, Person o2) {
                return o1.firstName.compareTo(o2.lastName);
            }
        };

//        people.sort(comparatorLastName);

//        people.sort(new Comparator<Person>(){
//
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.firstName.compareTo(o2.lastName);
//            }
//        });

//        Lambda Expression
//        Lambda Expressions are only work with functional interfaces which only
//        one abstract method

        people.sort((o1, o2) -> o1.lastName.compareTo(o2.lastName));
        System.out.println(people);

        List<String> words = new ArrayList<>(List.of(
                "Coding","Apps","Hacking","Matrix","DataStructures"
        ));

        for(String s: words){
            System.out.println(s);
        }

        System.out.println("____________");

//        forEach method extends Consumer interface java.util.function.Consumer package
//        has one abstract method { void accept(T t) }
//        words.forEach(s -> System.out.println(s));

        words.forEach((String s) ->{
            char firstletter = s.charAt(0);
            System.out.println(s + " means " + firstletter);
        });

        System.out.println("_______________");
        System.out.println();
//        predicate functional interface

        words.removeIf(s -> s.equalsIgnoreCase("Apps"));
        words.forEach(s -> System.out.println(s));
        System.out.println();

//        OWN functional interface
        int result = calculator((a,b) -> a+b, 5,2);

        System.out.println();
        var coords = Arrays.asList(
                new double[]{87887, -787877},
                new double[]{12398, -878126},
                new double[]{37919, -356278}
        );

        coords.forEach(s -> System.out.println(Arrays.toString(s)));



    }

    public static <T> T calculator(Operation<T> function, T value1, T value2){
        T result = function.operate(value1, value2);
        System.out.println("The operation result : " + result);
        return result;
    }

/*    Four basic categories of functional interface
java.util.functions
There are over forty interfaces in this package
these can all categorized by one of the following package

Consumer void accept (T t) execute code without returning data
Function R apply(T t) return a result of an operation function
Predicate boolean test(T t) test if condition is true or false
Supplier T get() return an instance of something
 */
}