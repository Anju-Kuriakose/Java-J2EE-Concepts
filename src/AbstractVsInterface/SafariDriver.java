package AbstractVsInterface;

public class SafariDriver implements WebDriver{
	
	public SafariDriver() {
		System.out.println("launching safari..");
	}
	
	
	
	
	@Override
	public void get(String url) {
		System.out.println("Launch Safari" +url);
	}
		@Override
		public void close() 
			{
				System.out.println("Close the browser");
			}
		
		@Override
		public void getTitle(){
			System.out.println("safari..get the title");
		}
		@Override
		public void getCurrentUrl(){
			System.out.println("safari..get the current url");
		}
		@Override
		public void findElement(String element){
			System.out.println("find element :" +element);
		}

}
