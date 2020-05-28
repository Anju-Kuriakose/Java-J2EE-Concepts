package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) 
	{
		BMW b=new BMW();
		b.start();//output is BMW..start it means it has overloaded the Car start method and is no longer available to BMW class
		b.stop();
		b.refuel();
		b.autoParking();
		//b.engine();//this property is from the grandparent class vehicle 
		b.engine();
		
		
		Car c=new Car();
		c.start();//this the start method of car class
		c.stop();
		c.refuel();
	//c.autoParking() is not allowed,method is not available as Parent class can not access child class properties.
		//c.engine();
		c.engine();
		
		
		Audi au=new Audi();
		au.start();
		au.stop();
		au.refuel();
		//au.autoParking();this is a property from BMW class and Audi can not inherit properties form siblings
		
		//creating child class object without any reference
		//Top casting: child class object can be referred by parent class reference variable
		
		Car c1=new BMW();
		c1.start();//bmw start method 
		c1.stop();//car stop method
		c1.refuel();//car refuel method
		//c1.autoParking is not allowed as this property is coming from BMW class and the car ref variable is referring it jvm 
		//will do  a Reference type check and deny access to it
		
		//with top casting we can access overridden method,non overridden method,method coming from grandparent
		
		//Down casting is not allowed in java at the run time but in the compile time it is allowed
		
		//means parent class object is referred by child class object reference variable
		
		BMW b1=(BMW)new Car();//classCastException. car can not be cast to BMW
		
		//we can not override a static method.
		//if method is declared final,inorder to prevent method overriding
		
		//in this example if car class  start() is made final bmw can not override the start method
		//If a class is declared final we can not extend this class means it can not have child class
		//polymorphism means same method in different forms,polymorphism is defined as method overloading and method oveeriding together
		
	}
	

}
