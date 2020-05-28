package OOP_Interface;
//only method declaration; methods are defined in a class
//No method body,only method prototype
//A class can have multiple interfaces but can not have muliple classes as parents (DIAMOND PROBLEM) IS SOLVED BY USING INTERFACES
//So we can have multiple interfaces along with a single class is possible

//can define static methods with method body
//can not create objects for interfaces



public interface USMedical {
	
	int min_fee=10; //Interface variables are static and final by default

	public void orthoServices();//a method which does not have method body is called abstract methods
	
	public void cardioServices();
	
	public void neuroServices();
	
	public void services911();
	
	
	//After jdk1.8 some changes have come in interfaces
	//Static methods can not override,it can access using calss name or interface name
	
	//can define static methods with method body
	
	public static void medicine(){
		
		System.out.println("USMedical...... medicine");
	}
	
	//can define default method in interface
   
	default void nursing(){
		
		System.out.println("USMedical...... nursing");
	}
	
}
