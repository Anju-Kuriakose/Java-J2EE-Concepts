package OOP_Interface;

public class FortisTest {

public static void main(String[] args) {
		
FortisHospital fs=new FortisHospital();
//can call overridden and non overridden methods as its a class

fs.cardioServices();
fs.neuroServices();
fs.medicalInsurance();
fs.pathoServices();

fs.pandemic();
fs.vaccination();
fs.polio();
fs.ebola();

fs.nursing();

//we can not create objects of interfaces in java
//but child class object can be referred by parent interface reference variable(TOP CASTING)

USMedical us=new FortisHospital();
us.cardioServices();//we can access methods coming from specific interface
us.orthoServices();
us.neuroServices();
us.services911();

//WE CAN NOT ACCESS METHODS FROM OTHER INETRFACES( REFERENCE TYPE CHECK WILL PREVENT THE ACCESS TO OTHER INTERFACES)

UKMedical uk=new FortisHospital();
uk.pediaServices();
uk.physioServices();

//STATIC METHODS CAN ACCESS USING THEIR CLASS NAME OR INTERFACE NAME

USMedical.medicine();

//we have a set an interface variable min_fee=10,to access it and as its static and  final in nature value can not be changed
//we can access interface variables from different packages
System.out.println(USMedical.min_fee);




	}

}
