package files.copyFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {
    public static void main(String[] args) {
        Path sourcePath = Paths.get("source.txt");
        if(!Files.exists(sourcePath)){
            try {
                Files.createFile(sourcePath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        Path destinationPath = Paths.get("copy.txt");

        try {
//            copy method in Files
            Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

