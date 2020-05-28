package JavaSessions;

public class Credentials {

	String username;
	String password;
	//Constructor is created to set the value(setters)
	public Credentials(String username, String password) {
		//super();
		this.username = username;
		this.password = password;
	}
	
	//Two methods are created to get the values(getters)
	public String getUserName() {
		return this.username;
	}
	public String getPassword() {
		return this.password;
	}
	public void doLogin(String un,String pwd) {
		System.out.println("logged in with:" +un+pwd);
	}
	
}
