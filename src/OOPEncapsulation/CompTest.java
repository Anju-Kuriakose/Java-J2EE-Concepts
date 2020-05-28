package OOPEncapsulation;

public class CompTest {

	public static void main(String[] args) {
		
		Company comp=new Company();
		comp.setName("Google");
		comp.setLogo("Google logo");
		comp.setTenderAmount(20000);
		comp.setTotalEmp(1000);
		comp.setInformation("New Contract");
		
		
		System.out.println(comp.getName());
		System.out.println(comp.getLogo());
		System.out.println(comp.getTenderAmount());
		System.out.println(comp.getTotalEmp());
		System.out.println(comp.getInformation());
		
		
		
		
	}

}
