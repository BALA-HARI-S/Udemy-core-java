package files.deleteFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path deleteThis = Paths.get("newFile.txt");
        if(!Files.exists(deleteThis)){
            try {
                Files.createFile(deleteThis);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        Path filePath = Paths.get("fileToDelete.txt");
        Path directoryPath = Paths.get("directoryToDelete");
        try {
            Files.delete(deleteThis);
            System.out.println("File deleted");
            Files.deleteIfExists(filePath);
//            Files.walkFileTree(directoryPath, new DeleteDirVisitor());
            System.out.println("File/directory deleted successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

