package OOP_Abstract;

public class PageTest {

	public static void main(String[] args) {
	
		LoginPage lp=new LoginPage();
		lp.header();
		lp.title();
		lp.getPageInfo();
		lp.doLogin("admin","admin123");

		//top casting
		
		Page p=new LoginPage();
	p.getPageInfo();//overridden methods from parent class page
	p.header();
	p.title();
	//p.doLogin(); can not be called as this method is inside the child class and will do reference type check when page class reference variable tries to access it
	
	//down casting is not possible as the parent class is abstract,bcoz we are not creating any objects 
	
	
	}

}
