package JavaSessions;

import java.util.ArrayList;

public class FunctionsInJava {
	
	//Methods and functions: both are same
		//Data members of a class : Class variables and class methods ,are given to  each and every objects we create	
			
			//can not create a method inside a method or main() method
			//means methods are independent with each other
			//methods are parallel to each other
						//user defined or custom  method eg:test() and default or system defined method(main())
	//Types of methods:1.Simple method: no input and no output
	//void means it does not return anything
	public static void main(String[] args) {
	
		
		FunctionsInJava obj=new FunctionsInJava();
		//calling a method
		obj.test();
		//obj.getTrainerName();
		String n1=obj.getTrainerName();//as this method return string value=naveen we have to store in a string variable n1 
		System.out.println(n1);
		//obj.getScore();
		int t=obj.getScore();
		System.out.println(t);
		
		//obj.add(23,22);
		int add=obj.add(23,22);
		System.out.println(add);
		
		int m1=obj.getMarks("Anu");
		System.out.println(m1);
		int m2=obj.getMarks("Anju");
		System.out.println(m2);
		int m3=obj.getMarks("Tom");
		System.out.println(m3);
		
		String c1=obj.getCaptitalName("India");
		System.out.println(c1);
		
		String c2=obj.getCaptitalName("United States");
		System.out.println(c2);
		
		String c3=obj.getCaptitalName("Japan");
		System.out.println(c3);
		
		String b1=obj.launchBrowser("Chrome");
		System.out.println(b1);
		String b2=obj.launchBrowser("Firefox");
		System.out.println(b2);
		
		String b3=obj.launchBrowser("Safari");
		System.out.println(b3);
		
		ArrayList<String> ar1=obj.getPageLinks("Login");
		System.out.println("the total links on the page :" +ar1.size());
		System.out.println(ar1);
		ArrayList<String> ar2=obj.getPageLinks("Home");
		System.out.println(ar2);
		
	}
	public void test() {
	
		System.out.println("test method");//without creating any objects in main() method output will be blank
	}
	
	//2.Return type method :no input but some return 
	//no input means no parameter is given in the method bracket ()
	
	//public void getTrainerName() -Void can not return anything ;return statements do not come along with void
	public String getTrainerName()//as this method return string make it public string methodName();
	{
		System.out.println("getTrainerName");
		String name="Naveen";//here name is string so we replace void with string
		return name;
	}
	
	//public void getScore() 
	public int getScore()//as this method returns integer value  make it public int methodName();
	{
		System.out.println("get score");
		int p1=20;
		int p2=30;
		int total=p1+p2;
		return total;
	}
	
	//3.Return type: some input and some output
	
	//public void add(int a,int b)
	public int add(int a,int b){
		System.out.println("this is my add method");
		int z=a+b;
		return z;//as it returns integer void replaces with int
		//return should be the last statement inside a function.we can not write any code after return as it says unreachable code		
	}
	//another example for 3rd type:return type with some input and some output
	public int getMarks(String StudentName) {
		System.out.println("getMarks method");
		int marks=0;//its not mandatory to declare it to zero
		if (StudentName.equals("Anu")) {
			marks=90;
		}
		else if(StudentName.equals("Anju")) {
			
			marks=98;
		}
		else {
			System.out.println(StudentName + " is not found..");
		}
		return marks;
	}  
	
	//another example 
	public String getCaptitalName(String country) {
		System.out.println("Capital name for"+ country);
		String capital=null;
		
		if (country.equals("India")){
			capital="New Delhi";
		}
		else if (country.equals("United States")) {
			capital="Washington DC";
		}
		else {
			System.out.println("Country not found");
		}
		return capital;
	}
	//another example using switch statement
	
	public String launchBrowser(String browserName){
		System.out.println("Browser name is:" + browserName);
		String driver=null;
		
		switch(browserName) {
		case "Chrome":
		driver= "launch chrome";
			break;
		case "Firefox":
			driver= "launch Firefox";
				break;
		case "IE":
			driver= "launch IE";
				break;
			
			default:
				break;
		
		}
		return driver;
		
	}
	
	//one parameter--string-page name
	//should return a list of all the links on the page
	
	public ArrayList<String> getPageLinks(String pageName) {
		System.out.println("links on this page:"+pageName);
		
		ArrayList<String> linksList=new ArrayList<String>();
		
		if(pageName.equals("Login")) {
			
			linksList.add("Sign In");
			linksList.add("Forgot password");
			linksList.add("cancel");
		}
		else if(pageName.equals("Home")) {
			linksList.add("Profie");
			linksList.add("My cart");
			linksList.add("Search");
			}
		else if(pageName.equals("Account")) {
			linksList.add("Profie");
			linksList.add("Order");
			linksList.add("Card details");
		}
		else {
			System.out.println("pageName + is not found");
		}
		return linksList;
		
	}
	}


