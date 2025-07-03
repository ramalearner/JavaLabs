package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {
    public static void main(String []args) {
        // file reading / writing

        try {
            File f = new File("/Users/vishwamithra/JavaLab/files", "touch2.txt");

            System.out.println(f.isDirectory());
            System.out.println(f.exists());

            String fileName = "output.txt";
            String data = "Hello, FileOutputStream!";

            // try-catch-resources block
            // User does not have to close the file handle
            // Resources that are opened in try are automatically closed after block
            try (FileOutputStream fos = new FileOutputStream(fileName)) {
                byte[] bytes = data.getBytes();
                fos.write(bytes);
                System.out.println("Data written to file successfully.");
            } catch (IOException e) {
                System.err.println("Error writing to file: " + e.getMessage());
            }

            // Traditional try catch block
            // User have to explicitly close the file handle
            // If user forgets to close the file, that results in a memory leak
            FileOutputStream fos2 = new FileOutputStream(fileName);
            try {
                byte[] bytes = data.getBytes();
                fos2.write(bytes);
                System.out.println("Data written to file successfully.");
            } catch (IOException e) {
                System.err.println("Error writing to file: " + e.getMessage());
            } finally {
//                    fos2.close();
            }

            // fos2 is still alive


        } catch(Exception ex) {
            System.out.println("Exception received");
        }
    }
}