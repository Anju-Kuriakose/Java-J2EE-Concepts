package AccessModifiers1;

public class Bike { //

	public static void main(String[] args) { //same package,non sub class 
		
Car c=new Car();
//we CAN NOT ACCESS PRIVATE METHODS OF THE PARENT CLASS in this class.(in this case getPrice())
	}

}//this class does not have any relation to class car.so we create any objects of class bike,we can not access any methods.thats why we created car class object
