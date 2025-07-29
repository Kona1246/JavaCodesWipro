package Day9;
import java.util.LinkedList;
import java.util.Iterator;

public class Collections_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList<Integer> listData = new LinkedList<>();
	        listData.add(20);
	        listData.add(40);
	        listData.add(80);
	        listData.add(90);

	        
	        System.out.println("LinkedList: " + listData);

	     
	        Iterator<Integer> iterator = listData.iterator();
	        System.out.println("Iterating through LinkedList:");
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	

	}


