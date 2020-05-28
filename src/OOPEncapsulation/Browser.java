package OOPEncapsulation;

public class Browser {
	
	public String name;
	public double version;
	
	private String Plugin;//this is private and if we need to access we need to create a public layer to access it
	
	public void setPlugin(String Plugin) {
		this.Plugin=Plugin;
	}
	
	public String getPlugin() {
		return Plugin;
	}
	
	
	public void launchBrowser() {
		System.out.println("launch browser");
		
		checkOSCompatible();
		System.out.println("launching browser");
		
	}
	
	
protected void checkOSCompatible() {
		System.out.println("check OS Compatible");
		
		checkBrowserExecutable();
	}
	
	protected void checkBrowserExecutable() {
		System.out.println("check Browser Executable");
		browserVersionCheck();
	}
	
	
	protected void browserVersionCheck() {
		System.out.println("Browser version check");
	}
	
	
	

}
