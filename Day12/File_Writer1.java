package Day12;

import java.io.FileWriter;
import java.io.IOException;

public class File_Writer1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String content = "This is a text write file of Sayantani:";

	    FileWriter writer = new FileWriter("C:\\File2.txt");
	    writer.write(content);
	    writer.close();  
	    
	    System.out.println("File written successfully!");
	}

	

	}


