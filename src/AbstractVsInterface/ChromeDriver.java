package AbstractVsInterface;

public class ChromeDriver implements WebDriver{
	
	public ChromeDriver() { //constructor
		System.out.println("launching google chrome");
	}
	
	@Override	
public void get(String url) {
	System.out.println("Launch google chrome :"+ url);
}
	@Override
	public void close() 
		{
			System.out.println("Close the browser");
		}
	
	@Override
	public void getTitle(){
		System.out.println("google chrome...get the title");
	}
	@Override
	public void getCurrentUrl(){
		System.out.println("google chrome..get the current url");
	}
	@Override
	public void findElement(String element){
		System.out.println("find element :" +element);
	}

}
