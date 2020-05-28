package OOP_Abstract;

public abstract class WebPage { //can be a parent class 
	/////  0 % abstraction ///// no abstract methods 
	/*public void history(String name) {
		
	}
	
public void history(String name,String date) {
		
	}*/
	
	//partial abstraction is a combination of abstract and non abstract methods eg:page abstract class
	
	
	//100 % abstraction -only abstract methods
	
	public abstract void history(String name);
	public abstract void history(String name,String date);

//interface is 100 % abstraction	
}
