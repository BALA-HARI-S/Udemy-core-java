package operations.source.stream;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NextMain {
    public static void main(String[] args) {

        List<String> bingoPool = new ArrayList<>(75);
        int start = 1;
        for(char c : "BINGO".toCharArray()){
            for (int i = start; i < (start + 15); i++){
                bingoPool.add("" + c + i);
            }
            start += 15;
        }

//        System.out.println("Bingo Pool");
//        for(String s: bingoPool){
//            System.out.println(s);
//        }
        System.out.println("__________________");

        System.out.println("First 15 Shuffled");
        Collections.shuffle(bingoPool);
        for (int i = 0; i < 15; i++){
            System.out.print(bingoPool.get(i) + " ");
        }
        System.out.println("\n__________________");

        System.out.println("First 15 Sublist & natural order");
//        List<String> firstOnes = bingoPool.subList(0, 15);
        List<String> firstOnes =new ArrayList<>(bingoPool.subList(0, 15));
        firstOnes.sort(Comparator.naturalOrder());
        firstOnes.replaceAll(s -> {
            if (s.indexOf('G') == 0 || s.indexOf('O') == 0){
                String updated = s.charAt(0) + "-" + s.substring(1);
                System.out.print(updated + " ");
                return updated;
            }
            return s;
        });
        System.out.println("\n_____________________");
        System.out.println("After sublist & natural order");
        for (int i = 0; i < 15; i++){
            System.out.print(bingoPool.get(i) + " ");
        }

        System.out.println("\n_____________________");
        System.out.println("\nUsing Streams");
//        same thing using Streams
        bingoPool.stream()
                .limit(15)
                .filter(s -> s.indexOf('G') == 0 || s.indexOf('O') == 0)
                .map(s -> s.charAt(0) + "-" + s.substring(1))
                .sorted()
                .forEach(s -> System.out.print(s + " "));

        System.out.println("\n_____________________");
        System.out.println("Streams on Arrays and Strings, then chaining");
        String[] strings = {"One", "Two", "Three"};
        var firstStream = Arrays.stream(strings)
                .sorted(Comparator.reverseOrder());
//                .forEach(System.out::println);

        var secondStream = Stream.of("Six","Five","Four")
                .map(String::toUpperCase);
//                .forEach(System.out::println);

        Stream.concat(secondStream, firstStream)
                .forEach(System.out::println);

        System.out.println("\nGenerate static method");
        Random random = new Random();
        Stream.generate(() -> random.nextInt(2))
                .limit(10)
                .forEach(s -> System.out.print(s + " "));

        System.out.println("\nIterate static method v1");
        IntStream.iterate(1, n -> n+1)
                .filter(NextMain::isEven)
                .limit(10)
                .forEach(s -> System.out.print(s + " "));

        System.out.println("\nIterate static method v2");
        IntStream.iterate(1, n -> n+1)
                .limit(10)
                .filter(NextMain::isEven)
                .forEach(s -> System.out.print(s + " "));

        System.out.println("\nIterate static method v3");
        IntStream.iterate(1, n -> n <= 10 ,n -> n+1)
                .filter(NextMain::isEven)
                .forEach(s -> System.out.print(s + " "));

        System.out.println("\nRange static method");
        IntStream.range(1, 10)
                .filter(NextMain::isEven)
                .forEach(s -> System.out.print(s + " "));
    }

    public static boolean isEven(int number){
        if (number % 2 == 0){
            return true;
        }
        return false;
    }
}
