package JavaCodesDay5;

public interface WiproSystems {
	void deviceType();
	void compilespeed();
}
class Desktop implements WiproSystems{
	public void deviceType() {
		System.out.println("Wipro provides device:DESKTOP");
	}
	public void compilespeed() {
		System.out.println("Code is compiled faster in Desktop");
}
}
class Laptop implements WiproSystems{
	public void deviceType() {
		System.out.println("Wipro provides device:LAPTOP");
	}
	public void compilespeed() {
		System.out.println("Code is compiled slower in Laptop");
}
	
	}


