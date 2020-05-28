package JavaSessions;

public class LoginPage {
//example for method overloading
	
	//if the feature is same ,make it same method and different parameters 
	public void login() {
		
	}
public void login(long phonenumber) {
		System.out.println("the phone numeber:" +phonenumber);
	}
	
	
public void login(long phonenumber,int otp) {
	
}
	
public void login(String un,String pwd) {
	
}
	
public void login(String un,String pwd,int otp) {
	
}

	
public void login(String un,String pwd,String role) {
	
}

public void login(String SiocSocialMediaAccount) {
	
}
	
	public static void main(String[] args) {

LoginPage lp=new LoginPage();
lp.login(99999);

	}

}
