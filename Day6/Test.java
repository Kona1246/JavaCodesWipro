package JavaCodesDay6;


public class Test implements A {
	public void show() {
        System.out.println("Implemented show() method from interface A");
    }

	public static void main(String[] args) {
		
		Test obj = new Test();
        obj.show(); 
    }


	}


