package JavaSessions;

public class FacebookLogin {

	public static void main(String[] args) {
		
		
Credentials cred=new Credentials("anju@gmail.com","anju123");

//System.out.println(cred.getUserName());
//System.out.println(cred.getPassword());
cred.doLogin(cred.getUserName(), cred.getPassword());

	}

}
