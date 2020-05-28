package JavaSessions;

import java.util.ArrayList;

public class User {
	//Constructor is a special entity of any java class with name same as the class name
	//constructor is created for non static properties of a class
			//1.it looks like  a function but its not a function
	//2.same name as class name
	//3.No void and no return type
	//4.constructor overloading is possible
	//zero parameter constructor is also called default constructor
	String name;
	int age;
	String email;
	long phone;
	boolean isActive;
	char gender;
	ArrayList<String>paymentOptions;
	
	public User() {//0 parameter constructor
		System.out.println("default constructor");
		
	}
	public User(int i) {//1 parameter constructor
		System.out.println("1 parameter constructor" + i);
		
	}
	public User(String name,int i) {//2 parameter constructor
		System.out.println("2 parameter" + " "+ name +" "+ i);
		
	}
	
	//1.create a constructor for User class with limited properties name,age and email,active or not
	//create a constructor with limited class variables.
	
	public User(String name,int age,String email,boolean isActive) {//variables (name,age,email,isActive) given inside the constructors are local variables and 
	
	//we need to access he class variables we need to use this keyword(to differentiate local variables from class variables
	//this.class variable=local variable
		//we can create a constructor with limited class variables
		this.name=name;
		this.age=age;
		this.email=email;
		this.isActive=isActive;
		
	}
	//2.create a User class constructor with all class variables
	
	public User(String name, int age, String email, long phone, boolean isActive, char gender,ArrayList<String> paymentOptions) {
		//super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.isActive = isActive;
		this.gender = gender;
		this.paymentOptions = paymentOptions;
	}
	
	
	
	public User(String name, int age, ArrayList<String> paymentOptions) {
		//super();
		this.name = name;
		this.age = age;
		this.paymentOptions = paymentOptions;
	}
	
	public static void main(String[] args) {
		//User u1=new User();//default constructor object created
		//User u1=new User(10);//one parameter object
		//User u1=new User("Anju",34);//2 parameter object created
		
		User u1=new User("Tom",25,"tom@gmail.com",true);
		User u2=new User("Anju",30,"anju@gmail.com",false);
		
		ArrayList<String> paymentList=new ArrayList<String>();//this arraylist can be used for other user users as well 
		
		paymentList.add("Google Pay");
		paymentList.add("Debit Card");
		User u3=new User("Tinu",38,"tinu@gmail.com",999999,true,'M',paymentList);
		User u4=new User("Sarah",20,paymentList);
		System.out.println(u1.name);
		System.out.println(u1.age);
		System.out.println(u1.email);
		System.out.println(u1.isActive);
		
		System.out.println(u2.name+" "+u2.isActive);	
		
		System.out.println(u3.name+" "+u3.age+" "+u3.email+" "+u3.isActive+" "+u3.gender+" "+u3.paymentOptions);
		System.out.println(u4.name+" "+u4.age+" "+u4.paymentOptions);
		
	}

}
