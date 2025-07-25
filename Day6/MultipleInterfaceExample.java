package JavaCodesDay6;
interface InterfaceA {
    void display();
}

interface InterfaceB {
    void display();
}

interface InterfaceC{
	void display();
}


class CommonClass implements InterfaceA, InterfaceB {
    
    public void display() {
        System.out.println("Display method from CommonClass implementing both Interface A and Interface B");
    }
}
public class MultipleInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CommonClass obj = new CommonClass();
	        obj.display();  
	    }
	

	}


