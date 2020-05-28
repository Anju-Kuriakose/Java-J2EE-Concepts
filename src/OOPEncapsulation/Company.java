package OOPEncapsulation;

public class Company {
	String name;
	String logo;
	public int totalEmp;
	private int tenderAmount;
	private String information;
	
		//constructor is created to set the class variables values

	/*public Company(String name, String logo, int totalEmp, int tenderAmount, String information) {
		//super();
		this.name = name;
		this.logo = logo;
		this.totalEmp = totalEmp;
		this.tenderAmount = tenderAmount;
		this.information = information;
	}*/

//getter and setter methods:in this example we need to create 10 getter and setter methods and in complex applications it is not possible for us to create it 
	//right click>source>generate getter and setter methods
		

/*public void setName(String name) {
	this.name = name;
}

public String getName() {
	return name;
}
*/
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public int getTotalEmp() {
		return totalEmp;
	}

	public void setTotalEmp(int totalEmp) {
		this.totalEmp = totalEmp;
	}

	public int getTenderAmount() {
		return tenderAmount;
	}

	public void setTenderAmount(int tenderAmount) {
		this.tenderAmount = tenderAmount;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}
public static void main(String[] args) {
		

	}

}
