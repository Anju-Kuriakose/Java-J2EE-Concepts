package JavaSessions;

import java.util.ArrayList;

public class WebpageTesting {

	public static void main(String[] args) {
		
		ArrayList<String> linksList=new ArrayList<String>();
		
		linksList.add("Sign up");
		linksList.add("Forgot pwd");
		linksList.add("reset pwd");
		
		ArrayList<String> homeLinksList=new ArrayList<String>();
		
		Webpage loginPage=new Webpage("login","http://www.amazon.com/login",linksList);
		Webpage homePage=new Webpage("Home","http://www.amazon.com/home",homeLinksList);
		System.out.println(loginPage.title+" "+loginPage.url+" "+loginPage.linksList+" "+Webpage.logo);
		System.out.println(homePage.title+" "+homePage.url+" "+homePage.linksList+" "+Webpage.logo);
	}

}
