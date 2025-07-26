package Day7;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExceptionHandlingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("C:\\Sayantani.txt");

        // Optional: print the absolute path for debugging
        System.out.println("Looking for file at: " + f1.getAbsolutePath());

        try {
            BufferedReader br1 = new BufferedReader(new FileReader(f1));
            String line = br1.readLine();

            while (line != null) {
                System.out.println("File Content: " + line);
                line = br1.readLine();
            }

            br1.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO error occurred while reading the file: " + e.getMessage());
        } finally {
            System.out.println("This is the complete execution");
        }
       
    }


	}


