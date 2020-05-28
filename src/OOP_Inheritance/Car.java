package OOP_Inheritance;

//Inheritance means inherit the properties of a parent.

//child class can inherit properties from parent and grandparents.
//Parent and grandparent classes can not inherit from child class
//Siblings also can not inherit from other child classes.

//child class is allowed to have a single parent.

public class Car extends Vehicle {//Car is the parent class 
	 
	public void start() {
		System.out.println("Car.....start");
	}
	
	
	public void stop() {
		System.out.println("Car.....stop");
	}
	
	public void refuel() {
		System.out.println("Car.....refuel");
	}
	
	
	
	
	
	
	

}
