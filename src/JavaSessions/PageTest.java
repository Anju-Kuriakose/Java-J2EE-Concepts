package JavaSessions;

import java.util.ArrayList;

public class PageTest {

	public static void main(String[] args) {
		Page loginpage=new Page();
		loginpage.url="http://amazon.com/login";
		loginpage.title="Amazon login";
		loginpage.logo="amazon logo";
		loginpage.header="login header";
		loginpage.footerLinklists=new ArrayList<String>();
		
		loginpage.footerLinklists.add("privacy policy");
		loginpage.footerLinklists.add("Contact us");
		loginpage.footerLinklists.add("Terms");
		
		System.out.println(loginpage.url);
		
		
		Page homepage=new Page();
		
		homepage.url="http://amazon.com/Home";
		homepage.title="Amazon homepage";
		homepage.logo="amazon logo";
		homepage.header="login header";
		homepage.footerLinklists=new ArrayList<String>();
		
		homepage.footerLinklists.add("privacy policy");
		homepage.footerLinklists.add("Contact us");
		homepage.footerLinklists.add("Terms");
		
		//Logo,header,footerlinks remains same in every page.
		//it takes lots of memory if we create objects everytime.
		//To overcome this create a variable static in CMA common memory allocation
		
	}

}
