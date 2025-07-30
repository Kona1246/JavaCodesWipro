package Day10;
import java.io.*;
public class FileCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String file1Path = "C:\\File1.txt";
        String file2Path = "C:\\File2.txt";

        try (BufferedReader reader1 = new BufferedReader(new FileReader(file1Path));
             BufferedReader reader2 = new BufferedReader(new FileReader(file2Path))) {

            String line1 = reader1.readLine();
            String line2 = reader2.readLine();
            boolean areEqual = true;
            int lineNum = 1;

            while (line1 != null || line2 != null) {
                if (line1 == null || line2 == null) {
                    areEqual = false;
                    break;
                } else if (!line1.equals(line2)) {
                    areEqual = false;
                    break;
                }

                line1 = reader1.readLine();
                line2 = reader2.readLine();
                lineNum++;
            }

            if (areEqual) {
                System.out.println("The two files have identical content.");
            } else {
                System.out.println("The two files differ at line " + lineNum);
                System.out.println("File1: " + line1);
                System.out.println("File2: " + line2);
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the files.");
            e.printStackTrace();
        }
    }

	}


