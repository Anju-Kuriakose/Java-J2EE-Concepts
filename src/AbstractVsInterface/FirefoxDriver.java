package AbstractVsInterface;

public class FirefoxDriver implements WebDriver{
	
	public FirefoxDriver() {
		System.out.println("launching firefox");
	}
	
@Override
	public void get(String url) {
		System.out.println("Launch Firefox" +url);
	}
		@Override
		public void close() 
			{
				System.out.println("Close the browser");
			}
		
		@Override
		public void getTitle(){
			System.out.println("firefox..get the title");
		}
		@Override
		public void getCurrentUrl(){
			System.out.println("firefox..get the current url");
		}
		@Override
		public void findElement(String element){
			System.out.println("find element :" +element);
		}
	
}
