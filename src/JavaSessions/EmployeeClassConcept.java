package JavaSessions;

import java.util.ArrayList;

public class EmployeeClassConcept {

	//class variables or class properties
	//these properties are given to each and every objects we create for this class
	String name;
	int age;//this is global variable and can be used anywhere within the class,any method and within the main() method
	String deptName;
	boolean isPermanent;
	String laptop[];
	ArrayList<String>devicesList;
	
	public static void main(String[] args) {
		
		int age;//its a local variable,can use and access within the main() only
		//need to create an object for the employee lass
		
		EmployeeClassConcept emp=new EmployeeClassConcept();
		//emp is the name of the object or object reference
		//new EmployeeClassConcept() is the object.
//can create multiple objects for a class
		emp.name="Tom";
		emp.age=25;
		emp.deptName="Admin";
		emp.isPermanent=true;
		emp.laptop=new String[3];
		emp.devicesList=new ArrayList<String>();//arraylist need to be initialized
		emp.devicesList.add("Apple iphone");//index0
		emp.devicesList.add("Samsung s8");//index1
		emp.devicesList.add("Windows 10");//index2
		System.out.println(emp.devicesList.get(0));
		
		
		EmployeeClassConcept emp1=new EmployeeClassConcept();
		emp1.name="Tina";
		emp1.age=26;
		emp1.deptName="QA";
		emp1.isPermanent=false;
		
		System.out.println(emp.name+" "+emp.age+" "+emp.deptName+" "+emp.isPermanent);
		System.out.println(emp1.name+" "+emp1.age+" "+emp1.deptName+" "+emp1.isPermanent);
		
		
		//we can create objects without any reference but the issue with this is JVM will automatically ask 
		//the garbage collector to remove objects without any references to improve the memory and system performance
		//system.gc() is user induced method to clean up the memory but that will not give 100percent guarantee that will go the memory.
		
		//we can not duplicate object reference
		
		EmployeeClassConcept emp3=new EmployeeClassConcept();
		System.out.println(emp3.name);//output is null as we are not giving any values to emp3 and it will give default string value:null
		//default value for an integer is 0,boolean is always false,and for string and arraylist is null
		System.out.println(emp3.devicesList);
		//default value for double is 0.0
		
		
		
	}

}
