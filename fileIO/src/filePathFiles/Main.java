package filePathFiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {

        useFile("testfile.txt");
        usePath("pathfile.txt");
    }

    private static void useFile(String filename){

        File file = new File(filename);
        boolean fileExists = file.exists();

        System.out.printf("File %s %s%n", filename,
                fileExists? "exists." : "does not exist.");

        if(fileExists){
            System.out.println("Deleting file: " + filename);
            fileExists = !file.delete();
        }

        if (!fileExists){
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Something wrong");
            }
            System.out.println("Created file: " + filename);
            if (file.canWrite()){
                System.out.println("File can write");
            }
        }
    }

    private static void usePath(String filename){

        Path path = Path.of(filename);
        boolean fileExists = Files.exists(path);

        System.out.printf("File %s %s%n", filename,
                fileExists? "exists." : "does not exist.");

        if(fileExists){
            System.out.println("Deleting file: " + filename);
            try {
                Files.delete( path);
                fileExists = false;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (!fileExists){
            try {
                System.out.println("creating file");
                Files.createFile(path);
                System.out.println("writing data to the file");
                if (Files.isWritable(path)){
                    System.out.println("File can write");
                    Files.writeString(path, """
                        
                        Here is some data
                        For my file
                        just to prove
                        """);
                }
                System.out.println("____________");
                System.out.println("I can read too");
                Files.readAllLines(path).forEach(System.out::println);
            } catch (IOException e) {
                System.out.println("Something wrong");
            }
        }
    }
}
