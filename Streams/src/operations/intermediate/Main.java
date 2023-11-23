package operations.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"One", "Two", "Three", "One"};
        Arrays.stream(strings)
                .forEach(s -> System.out.println(s + " "));
        System.out.println("distinct method");
        Arrays.stream(strings)
                .distinct()
                .forEach(s -> System.out.println(s + " "));

        IntStream.iterate((int) 'A', i -> i <= (int) 'z', i -> i+1)
                .filter(Character::isAlphabetic)
//                .skip(2)
                .dropWhile(i -> Character.toUpperCase(i) < 'A')
                .takeWhile(i -> i < 'a')
                .filter(c -> c == (int)'B')
                .peek(c -> System.out.println("its B"))
                .forEach(c -> System.out.printf("%c ", c));

        System.out.println();
        Random random = new Random();
        Stream.generate(() -> random.nextInt((int)'A', (int)'Z' + 1))
                .limit(50)
                .distinct()
                .forEach(c -> System.out.printf("%c ", c));

        System.out.println();
        List<String> words = Arrays.asList("apple", "banana", "orange");

        List<String> result = words.stream()
                .filter(word -> word.length() <= 5)
                .peek(word -> System.out.println("Filtering: " + word))
                .map(String::toUpperCase)
                .peek(word -> System.out.println("Mapping: " + word))
                .toList();

    }
}
