package files.readingData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

//        FileReader is used to read text files
//        it reads data by default, one integer at a time
//        cannot resize the buffer
        try (FileReader reader = new FileReader("file.txt")) {
            char[] block = new char[1000];
            int data;
            while ((data = reader.read(block)) != -1) {
                String content = new String(block, 0, data);
                System.out.printf("---> [%d chars] %s%n", data, content);
            }
        } catch (IOException e){
            e.printStackTrace();
        }


//        can resize the buffer
        System.out.println("-----------------------------------");
        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader("file.txt"))) {

//            String line;
//            while((line = bufferedReader.readLine()) != null){
//                System.out.println(line);
//            }

            bufferedReader.lines().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        Files Functionality to reading files

        System.out.println(System.getProperty("file.encoding"));
        System.out.println(Charset.defaultCharset());

        Path path = Path.of("fixedWidth.txt");
        try {
//            this method is like FileReader which reads byte
//            Reads all bytes from a file and returns a byte[].
//            You can then convert the bytes to a string
            System.out.println(new String(Files.readAllBytes(path)));
            System.out.println("----------------");
//            readString() method reads and stores in a single string
            System.out.println(Files.readString(path));

            System.out.println("----------------");
//            readAllLines(Path path)
//            Reads all lines from a file and returns a List<String>
//            Each element in the list represents a line from the file

            Path filePath = Paths.get("fixedWidth.txt");
            List<String> lines = Files.readAllLines(filePath);
            lines.forEach(System.out::println);

            System.out.println("----------------");
//            lines(Path path)
//            Returns a Stream<String> that can be used to process the lines from the file
//            It allows for more flexible processing using stream operations
            try (Stream<String> lines1 = Files.lines(filePath)) {
                lines1.forEach(System.out::println);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
