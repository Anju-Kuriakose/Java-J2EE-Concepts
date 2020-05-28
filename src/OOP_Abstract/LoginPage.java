package OOP_Abstract;

public class LoginPage extends Page{


	public LoginPage() {
		System.out.println("login page.....default constructor");
	}
	
	@Override
public void header() {
	System.out.println("amazon login page header");
}
	@Override
	public void title() {
		System.out.println("amazon loginpage title");
	}
	
	
	public void doLogin(String un,String pwd) {
		System.out.println(" login with : "+un+" "+pwd);
	}
}
