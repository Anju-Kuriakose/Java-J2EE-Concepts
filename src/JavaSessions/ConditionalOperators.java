package JavaSessions;

public class ConditionalOperators {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		if(b>a){
			
			System.out.println("b is greater than a ");
			
		}
		else {
			
			System.out.println(" a is greater b");
		}
		
		//write a logic to find the highest number
		
		
		int a1=100;
		int b1=200;
		int c1=300;
		
		if((a1>b1) & (a1>c1)) {
			System.out.println("a1 is the greatest");
					}
		
		else if (b1>c1){
			System.out.println("b1 is the greatest");
		}
		else {
			System.out.println("c1 is the greatest");
		}
	}



	}


