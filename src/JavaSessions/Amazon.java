package JavaSessions;

public class Amazon {
	
	//METHOD OVERLOADING :COMPILE TIME POLYMORPHISM
	//WITHIN THE SAME CLASS 
	//SAME METHOD NAME FOR ALL METHODS
	//DIFFERENT types of PARAMETERS / DIFFRENT NUMBERS OF PARAMETERS
	//DIFF SEQUENCE OF PARAMETERS
	
	public void search() {//0 parameter search
		System.out.println("zero parameter search");
	}
	
	public void search(String name) {//1 parameter search
		System.out.println("1 parameter search" +name);
	}

	public void search(int price) {//1 parameter search with different parameter type
		System.out.println("1 parameter search" +price);
	}
	
	public void search(String name,int price) {//2 parameter search
		System.out.println("2parameter search" +name +" "+price);
	}
	
	public void search(int price,String name) {//2 parameter search with sequence change
		System.out.println("2parameter search" +price +" "+name);
	}
	
	
	public static void main(String[] args) {
		Amazon am=new Amazon();
		am.search();//compiler is deciding which method is to be called on the basis of parameter passed and produces output in the run time.m/d overloading is also called compile time polymorphism
		am.search("Nike");//polymorphism means in this case we are creating different form of search method
		am.search(100);
		am.search("Macbook",10000);
		am.search(100, "shoes");
		
		
	}

}
