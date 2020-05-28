package AccessModifiers1;

public class Car { //within the same class we can access public,private,protected and default methods.

	public String name="BMW";
	private int price=30;
	protected String engine="petrol";
	int wheels=4;
	
	public void getName() {
		System.out.println("get name of the car");
	}
	
	private void getPrice() {
		System.out.println("get price of the car");
	}
	protected void getEngine() {
		System.out.println("get engine details of the car");
	}
	
	 void getWheels() {
		System.out.println("get wheels of the car");
	}
	 public static void main(String[] args) {
		 Car c=new Car();
		 c.getEngine();
		 System.out.println(c.engine);
		 
	 }
	 
}
