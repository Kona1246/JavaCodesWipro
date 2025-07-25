package JavaCodesDay6;
interface MyInterface {
    
    static void staticMethod() {
        System.out.println("This is a static method in the interface.");
    }

    
    default void defaultMethod() {
        System.out.println("This is a default method in the interface.");
    }

    
    void VoidMethod();
}

class MyClass implements MyInterface {

  
    public void VoidMethod() {
        System.out.println("This is the normal void method implemented in the class.");
    }

    
    public void classVoidMethod() {
        System.out.println("This is another void method inside the class.");
    }
}


public class Difference {

	public static void main(String[] args) {
		
		MyInterface.staticMethod();

        
        MyClass obj = new MyClass();

        
        obj.defaultMethod();

        
        obj.VoidMethod();

        
        obj.classVoidMethod();
    }


	}


