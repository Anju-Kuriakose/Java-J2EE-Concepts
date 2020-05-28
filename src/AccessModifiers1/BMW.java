package AccessModifiers1;

public class BMW extends Car{ //same package ,sub class

	public static void main(String[] args) {
		
BMW b=new BMW();
b.getName();

//we CAN NOT ACCESS PRIVATE METHODS OF THE PARENT CLASS in this class.(in this case getPrice())

	}

}
