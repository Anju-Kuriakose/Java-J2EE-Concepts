package JavaSessions;
// calling different methods inside another method with the same object reference separately
// here in this example 3 methods are available with the same object and we can call within the method without creating the object
//all these methods are non static in nature
// but in the main() we need to call these methods using the object reference.


public class MethodChaining {
	
	public void m1() {
		m2();
	}
	
	
public void m2() {
		m3();
	}
	
public void m3() {
	m1();
}
public static void c1() {

	c2();
}

public static void c2() {
	System.out.println("c2");
	
}

	public static void main(String[] args) {
		
		MethodChaining  obj=new MethodChaining();
		//obj.m1();
		//obj.m2();
		//obj.m3();
		
		
		//how to call static methods call them directly or call by class name
		
		//c2();
		MethodChaining.c1(); //internally calling c1 static method ,c1 is calling c2() and c2 method got printed.
		
		
		
		//static methods can call other static methods but if the want to call non static methods ,they need to create objects
		//Non static methods call static methods by call them directly or by class name.
		//non static method can call non static methods,no need to create objects.
	}

}
