package OOP_Interface;

public class WHO implements UNHC{ //WHO is the parent of Fortis Hospital,extends WHO
	
public void pandemic() {
		
		System.out.println("WHO...... Pandemic");
		
		}
public void vaccination() {
	
	System.out.println("WHO...... vaccination");
}
@Override
public void ebola(){
	
	System.out.println("WHO...... ebola");
}
@Override
public void polio(){
	
	System.out.println("WHO...... polio");
}
}
