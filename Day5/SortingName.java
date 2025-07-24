package JavaCodesDay5;
import java.util.Arrays;
public class SortingName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] names = {"Rita", "Sayantani", "Tuhina", "Samaita", "Raju"};

	       
	        System.out.println("Original array:");
	        for (String name : names) {
	            System.out.println(name);
	        }

	        
	        Arrays.sort(names);

	        
	        System.out.println("\nSorted array (alphabetical order):");
	        for (String name : names) {
	            System.out.println(name);
	        }
	    }
	

	}


