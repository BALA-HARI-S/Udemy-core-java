package files.dirListing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {

        Path path = Path.of("fileIO");
//        "" means current working dir
        System.out.println("pwd = " + path.toAbsolutePath());

        try (var paths = Files.list(path)) {
            // list method - list of directories and files in the path
            paths
                    .map(Main::listDir)
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("_________________________");
        try (var paths = Files.walk(path, 3)) {
//             walk method - list of directories and files in the path
//             also you can specify depth to list sub files
            paths
                    .filter(Files::isRegularFile)
                    .map(Main::listDir)
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("_________________________");
        try (var paths = Files.find(path, Integer.MAX_VALUE,
                (p, attr) -> attr.isRegularFile() && attr.size() > 300 )) {
//             walk method - list of directories and files in the path
//             also you can specify depth to list sub files
            paths
//                    .filter(Files::isRegularFile)
                    .map(Main::listDir)
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        System.out.println("============Directory Streaming==============");
        try (var dirs = Files.newDirectoryStream(path, "*.iml")){ // glob - regex
            // result is an iterable type so use foreach
            dirs.forEach(d -> System.out.println(d));
        } catch (IOException e){
            throw new RuntimeException(e);
        }

//        Alternate for glob parameter - use lambda
        System.out.println("============Directory Streaming==============");
        try (var dirs = Files.newDirectoryStream(path,
                p -> p.getFileName().toString().endsWith(".iml"))){
            // result is an iterable type so can use foreach here
            dirs.forEach(d -> System.out.println(d));
        } catch (IOException e){
            throw new RuntimeException(e);
        }

    }

    private static String listDir(Path path){

//         check if it's a directory
        boolean isDir = Files.isDirectory(path);
        try {
            FileTime dateField = Files.getLastModifiedTime(path);
            LocalDateTime modDT = LocalDateTime.ofInstant(
                    dateField.toInstant(), ZoneId.systemDefault());
            return "%tD %tT %-5s %10s %s".formatted(modDT, modDT, isDir? "<DIR>" : "",
                    isDir? "" : Files.size(path), path);
        } catch (IOException e) {
            System.out.println("Something wrong with " + path);
            return path.toString();
        }


    }
}
