import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Current working directory : " +
                new File("").getAbsolutePath());
        for(File f: File.listRoots()){
            System.out.println(f);
        }

        String filename = "files/testing.csv";

        File file = new File(filename);
        if(!file.exists()){
            System.out.println("file doesn't exist");
        } else {
            System.out.println("I'm good to go!");
        }

        Path path = Paths.get(filename);
        if(!Files.exists(path)){
            System.out.println("2.file doesn't exist");
        } else {
            System.out.println("2.I'm good to go!");
        }


    }

    private static void testFile(String filename){
        Path path = Paths.get(filename);
        try {
            List<String> lines = Files.readAllLines(path);
            System.out.println("file exist() and lines added");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("!!!");
        }
    }

    public static void testFile2(String filename){

        try (FileReader reader = new FileReader(filename)) {
        } catch (IOException e) {
            System.out.println("File " + filename + " doesn't exist");
            throw new RuntimeException(e);
        }

//        FileReader reader = null;
//        try {
//            reader = new FileReader(filename);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } finally {
//            try {
//                reader.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
    }

}