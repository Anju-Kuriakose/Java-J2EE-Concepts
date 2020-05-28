package JavaSessions;

public class StaticVsNonstaticMethodConcepts {
	String name;
	static int age;
	//static is always for class variables not for local variables,method properties
	public void getName()
	{
		System.out.println("get name");
	}
	
	public static void getEmail() {
		System.out.println("get email");
	}
	
	
	
	public static void main(String[] args) {
		
	//	int i=10;//we can not make it static,only final is permitted
		
//1.How to to access non static methods :by creating objects 
		
		StaticVsNonstaticMethodConcepts obj=new StaticVsNonstaticMethodConcepts();	
		
		obj.name="Tom";
		System.out.println(obj.name);
		obj.getName();
		
//2.How to access static methods and variables :
		
		//a.call them directly
		
		getEmail();
		age=20;
		System.out.println(age);
		
		//b.call them by class name
		
		StaticVsNonstaticMethodConcepts.age=30;
		StaticVsNonstaticMethodConcepts.getEmail();
		
	}

}
