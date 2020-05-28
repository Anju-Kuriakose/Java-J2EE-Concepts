package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {
		
		// 1. while loop
		//disadvantage of while loop is it will generate infinite 
				//loops if we don't give incremental/decremental part
		
		//To print numbers from 1 to 10 output:0 1 2 3 4 ..10
		int i=1;
		while(i<=10) {
			
			System.out.println(i);
			i++;
		}
		//To print numbers 1 to 10 in reverse order.output:10 9 8 7..0
		int j=10;
		while(j>=0) {
			
			System.out.println(j);
			--j;
		}
		int p=1;
		while (p<=20) {
			if (p % 5==0)
			{
			System.out.println("hey");
			
			}
			p++;
		}

		//2. for loop        
		
		//To print numbers 0 to 10 using for loop
		
		for(int k=0;k<=10;k++)
		{
			System.out.println(k);
		}
		
		
		//To print the numbers from 0 to 10 in reverse
		
		
		for(int l=10;l>=0;l=l-1) {
		
			System.out.println(l);
		}
	
			//To print even numbers from 0 to 10
			
			for(int even=0;even<=10;even=even+2) {
				System.out.println(even);
			}
		
			
//to print from 10 to -10
			
			for(int m=10;m>=-10;m--)
			{
				System.out.println(m);
			
				
			}
			//3.do while loop
			
		/*	
			int t=1;
			do
			{
				System.out.println(t);
		t++;
			}

			while(t<=10);*/
		
	}		
}
