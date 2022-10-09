import java.io.*;
import java.util.Scanner;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class MyScanner {
    public static void main(final String[] args) {
        File file = new File("NewFolder/enteredWords.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter magic word: ");
        String word = "";

        while (!word.equals("exit")) {
            word = scanner.nextLine().toLowerCase();
            try (OutputStream outputStream = new FileOutputStream(file, true)) {
                outputStream.write(word.getBytes());
                outputStream.write("\n".getBytes());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
