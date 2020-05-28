package JavaSessions;

public class AssignmentsOnLoops {

	public static void main(String[] args) {
		 
	//1.
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("I am batman");
		}
		
		System.out.println("**************");
		//2.
		
		int j=1;
		while(j<=9)
		{
			System.out.println("I am batman" +j);
			j++;
			
		}
		
		System.out.println("**************");
		//3.WAP to print 10 to 1 using for, while and do-while loop
		
		
		for(int r=10;r>=1;--r)
		{
			System.out.println(r);
		}
		
		System.out.println("**************");
		
		int k=10;
		while(k>=1)
		{
		System.out.println(k);
		--k;
		}
		
		System.out.println("**************");
		
		int s=10;
		do
		{
			System.out.println(s);
			--s;;
		}while(s>=1);
		
		System.out.println("**************");
		
		//4.Write a program in Java to print "Hello World" ten times using while loop
		
		int a=1;
		while(a<=10)
		{
			System.out.println("Hello World");
			a++;
		}
		
		System.out.println("**************");
		
		//5.Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered
		
		int p=1;
		while(p<=10) 
						
			{
				System.out.println(p);
				
				if(p%7==0){
					
					break;
					
				}
						p++;
			}
				
		}
}	
		
	
	


