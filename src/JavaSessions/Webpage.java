package JavaSessions;

import java.util.ArrayList;

//another example for constructors
public class Webpage {
	
	String title;
	String url;
	final static String logo="Amazon";
	 ArrayList<String>linksList;
	 
	 //create a constructor
	 //As logo is static,it is not created inside the constructor bcoz no objects are created for a static property
	 //constructor is created for non static properties of a class
	public Webpage(String title, String url, ArrayList<String> linksList) {
		//super();
		this.title = title;
		this.url = url;
		this.linksList = linksList;
	}

	public Webpage(String title, String url) {
		//super();
		this.title = title;
		this.url = url;
	}
	 
	 
	

}
