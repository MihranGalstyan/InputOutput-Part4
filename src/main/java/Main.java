import java.io.*;
import java.util.Arrays;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Main {
    public static void main(final String[] args) {
        // Creating new folder
        File file = new File("NewFolder");
        file.mkdir();

        // Creating text file
        File txtFile = new File("NewFolder/names.txt");
        try {
            txtFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(txtFile, true))) {
            String names = "Andrew, Hawking, Blade, Africa, Anaconda";
            String otherText = "\nSome other text here";
            outputStream.write(names.getBytes());
            outputStream.write(otherText.getBytes());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
