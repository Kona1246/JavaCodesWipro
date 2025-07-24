package JavaCodesDay5;
import java.util.*;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class RealEstateApp {
		    static List<RealEstateProperty> properties = new ArrayList<>();

		    public static void main(String[] args) {
		        properties.add(new RealEstateProperty("123 Main St", 250_000, 3));
		        properties.add(new RealEstateProperty("456 Oak Ave", 150_000, 2));
		        properties.add(new RealEstateProperty("789 Pine Rd", 500_000, 4));
		        properties.add(new RealEstateProperty("321 Cedar Ln", 200_000, 3));

		        
		        filterAndAct(p -> p.getPrice() < 300_000,
		                p -> System.out.println("Affordable: " + p));

		        System.out.println();

		       
		        filterAndAct(p -> p.getBedrooms() == 3,
		                p -> System.out.println("Schedule showing: " + p));
		    }

		    static void filterAndAct(Predicate<RealEstateProperty> tester, Consumer<RealEstateProperty> action) {
		        for (RealEstateProperty p : properties) {
		            if (tester.test(p)) {
		                action.accept(p);
		            }
		        }
		    }
		

	}



