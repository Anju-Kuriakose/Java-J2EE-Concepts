package JavaSessions;

public class MainMethodOverloading {
	
//we can create multiple main method but with different parameters
//Main method can be overloaded but main() signature should not be changed for jvm	
	
	
	public static void main(String[] args) {
		//instead of String a[] if we write int a[] we can not execute this program,error showing main method not found 
		//define main method as public static void main(String[] args) -signature format for main() method but still we can overload with different parameters
		
System.out.println("hi");
main(10);
main("Anju");
	}


	public static void main(int i) //in order to print this main method call them directly as it is static in nature
	{
		//STATIC METHODS CAN ALSO BE OVERLOADED
		
System.out.println("hello"+ i);
	}
	

	public static void main(String name) {
		
System.out.println("My name is "+ name);
	}


}
