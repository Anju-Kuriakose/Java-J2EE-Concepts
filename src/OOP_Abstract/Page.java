package OOP_Abstract;



public abstract class Page {
//can not create the object of the abstract class but can create constructor
	//abstract method is declaring a method with no method body;no implementation of methods
	//abstract class can have abstract and non abstract methods
	
	////we can create constructor,but can not be called by creating object as the class is in abstract nature CALLED WHEN CREATING THE OBJECT OF THE CHILD CLASS LOGIN PAGE
	public Page() {
		System.out.println("page class... default constructor");
	}
	
	public abstract void header();//abstract methods can not be final
	
	public abstract void title();
	
	public void getPageInfo() { //Non abstract method; it can be final
		
		System.out.println("Page......getpageinfo");
	}
	
}
