package OOPEncapsulation;

public class BrowserTest {
//encapsulation means hiding unnecessary secured information to the users.
	
	public static void main(String[] args) {
		
		Browser br=new Browser();
		br.launchBrowser();
		
		
	br.setPlugin("IDE");
	System.out.println(br.getPlugin());
	}

}
