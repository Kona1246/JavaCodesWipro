package Day11;
import java.io.FileWriter;
import java.io.IOException;


public class Writetosimplefile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	           FileWriter writer = new FileWriter("C:\\\\File1.txt");
	           writer.write("Hello, I am trying to find testing tools for the project.\n");
	           writer.write("Tools like automation and performance tools.\n");
	           writer.close();
	           System.out.println("Data written to file successfully");
	       } catch (IOException e) {
	           System.out.println("An error occurred while writing to the file.");
	           e.printStackTrace();
	       }
	   }
	

	}


