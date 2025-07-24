package JavaCodesDay5;
import java.util.ArrayList;
import java.util.Collections;

public class Array_sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> employees = new ArrayList<String>();
		employees.add("Ahad");
		employees.add("Krishna");
		employees.add("Jabbar");
		employees.add("Chetan");
		employees.add("Prabhal");
		employees.add("Sukendra");
		employees.add("Anshu");
		employees.add("Meehir");
		employees.add("Shivam");
		
		
		System.out.println("ArrayList before sorting is : " + employees);
	 
		Collections.sort(employees);
		
		System.out.println("ArrayList after sorting is : " + employees);
	}
	



	}


