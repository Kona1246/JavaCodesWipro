package Day12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\File1.txt", true));
	        
	        bw.write("This is written using FileWriter");
	        bw.newLine(); // Optional: writes a new line
	        bw.close();
	        
	        System.out.println("Written Successfully");
	    }

	

	}


