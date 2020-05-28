package OOP_Inheritance;

public class BMW extends Car{//BMW  is one of the child class of Car parent class

	//here BMW class inherit all the properties start(),stop(),refuel() from the parent class as default
	//but BMW dopesn't want parent's start() property it wants to have their own start() method and other own properties.(Method Overriding)
	//Method Overriding is when we have a method in parent c;ass and the same method in child class with same name and same number of arguments.
	
	@Override //annotation to show that this method is overloaded
	public void start() {
		System.out.println("BMW.....start");
	}
	
	public void autoParking() {
		System.out.println("BMW.......autoParking");
	}
	
	
	
}
