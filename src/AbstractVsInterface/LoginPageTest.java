package AbstractVsInterface;

public class LoginPageTest {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver(); //as WebDriver is an interface ,we can not create objects we call by using top casting
		driver.get("http://www.google.ca");//this get method is from the chromedriver class
		driver.getTitle();
		driver.getCurrentUrl();
		driver.findElement("search");
		driver.close();
		
		
		
		
	}

}
