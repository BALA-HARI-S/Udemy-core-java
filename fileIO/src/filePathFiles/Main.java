package filePathFiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.Instant;

public class Main {
    public static void main(String[] args) {

//        useFile("testfile.txt");
//
//        usePath("pathfile.txt");

        Path path = Path.of("files/logs/new/test/logfile.txt");
        printPathInfo(path);
        logStatement(path);
    }

    private static void printPathInfo(Path path){

        System.out.println("Path: " + path);
        System.out.println("fileName = " + path.getFileName());
        Path absolutePath = path.toAbsolutePath();
        System.out.println("Absolute Path = " + absolutePath);
        System.out.println("Abs path Root = " + absolutePath.getRoot());
        System.out.println("Root = " + path.getRoot());
        System.out.println("isAbsolute = " + path.isAbsolute());
//        getParent() used to obtain the parent path of the current path.
        System.out.println("getParent() = " + path.getParent());

        System.out.println(absolutePath.getRoot());
//        int i = 1;
//        var it = absolutePath.iterator();
//        while(it.hasNext()){
//            System.out.println(".".repeat(i++) + " " + it.next());
//        }

        int pathParts = absolutePath.getNameCount();
        for (int i = 0; i < pathParts; i++){
            System.out.println(".".repeat(i + 1) + " " + absolutePath.getName(i));
        }

        System.out.println("_________________________");
    }

    private static void logStatement(Path path){

        try{
            Path parent = path.getParent();
            if(!Files.exists(parent)){
//                Files.createDirectory(parent);
                Files.createDirectories(parent);

            }
            Files.writeString(path, Instant.now() + " : hello file\n" ,
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND);

        } catch (IOException e) {
            e.printStackTrace();
        }
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
