package OOP_Interface;

public class FortisHospital extends WHO implements USMedical,UKMedical,IndianMedical { 
	
	//implements means fortis hospital class is the child of USMedical interface
	
	//to implement any interface,it is the class's responsibility to implement those methods
	
	//US Medical methods 
	@Override
    public void orthoServices() {
    	
	System.out.println("FortisHospital...... orthoServices");
     }
	@Override
	public void cardioServices() {
		
		System.out.println("FortisHospital...... cardioServices");
	}
	@Override
	public void neuroServices() {
		System.out.println("FortisHospital...... neuroServices");
		
	}
	@Override	
	public void services911() {
		System.out.println("FortisHospital...... 911Services");
	
	}
	
	//UKMedical methods
	
@Override
public void pediaServices() {
	System.out.println("FortisHospital...... pediaServices");
	
}
	@Override	
	public void physioServices() {
		
		System.out.println("FortisHospital...... physioServices");
	}
	
	//Indian Medical methods
	@Override	
public void oncologyServices() {
	
	System.out.println("FortisHospital...... oncologyServices");
}
	@Override	
	public void radioServices() {
		
		System.out.println("FortisHospital...... radioServices");
	}
	@Override	
	public void pathoServices() {
		
		System.out.println("FortisHospital...... pathoServices");
	}
	
	//Fortis Hospital's own methods
	
public void medicalInsurance() {
		
		System.out.println("FortisHospital...... MedicalInsurance");
	}
	
public void optClinics() {
	
	System.out.println("FortisHospital...... optClinics");
}

//WHO 

@Override
public void vaccination() {
	
	System.out.println("Fortis Hospital...... vaccination");
}


}
