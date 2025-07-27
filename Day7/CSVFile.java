package Day7;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CSVFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File csvFile = new File("C:\\Testing.csv"); // your CSV file path

        
        System.out.println("Reading file from: " + csvFile.getAbsolutePath());

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(csvFile));
            String line;

            while ((line = br.readLine()) != null) {
                
                System.out.println("CSV Row: " + line);
            }
        } catch (IOException e) {
            System.out.println("Error occurred while reading the CSV file: " + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                System.out.println("Finished reading the file.");
            } catch (IOException e) {
                System.out.println("Error while closing the file: " + e.getMessage());
            }
        }
    }

	}


