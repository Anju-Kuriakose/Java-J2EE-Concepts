package AccessModifiers2;

import AccessModifiers1.Car;

public class Audi extends Car{  //DIFFERENT PACKAGE ,ANOTHER SUBCLASS OF CAR :we can not access private and default methods of the parent class
//only protected and public are accessible
	public static void main(String[] args) {
		Audi a=new Audi();
		Car c=new Car();

	}

}
