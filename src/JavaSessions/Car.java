package JavaSessions;

public class Car {
	String name;
	String color;
	int price;
	String model;
	static int wheels=4;//common property for all cars ,we set to static 
	//if we dont set it to static  all the objects will have access and unnecessary memory is utilized to store 

	//difference between static and final
	//static independent of the object of the class.
	//final i s used to declare  a constant variable that can not be overridden and a class can not be inherited
	
	public static void main(String[] args) {
		//Main() is set static in nature as it is only for execution without creating any objects of their own.
		//Main() is void in nature because it will not return any value
		//we are passing some arguments(array arguments) but not returning anything.command line arguments.
		
	Car c1=new Car();
	c1.name="Audi";
	c1.color="red";
	c1.price=75;
	c1.model="Q5";
	
	
	Car c2=new Car();
	c2.name="BMW";
	c2.color="white";
	c2.price=90;
	c2.model="520d";
	
	System.out.println(c1.name+" "+c1.color);//Audi red
	
	System.out.println(Car.wheels);//as wheel property is static it is called by class name
	
	
	
	}

}
