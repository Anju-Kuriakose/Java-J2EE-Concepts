package JavaSessions;

public class AssignmentOnConditionalOperators {

	public static void main(String[] args) {
		//1.Take four numbers  and print the greatest number. 
		int a=25;
		int b=78;
		int c=87;
		int d=90;
		
		if ((a>b)&& (a>c)&&(a>d))//False & False & False - False
		{
			System.out.println("the greatest :" +a);
		}
		else if((b>a)&&(b>c)&&(b>d))//True & False & False -False
		{
			System.out.println("the greatest :" +b);
		}
		else if ((c>a)&&(c>b)&&(c>d))//True & True & False -False
		{
			System.out.println("the greatest :" +c);
		}
		else
		{
			
			System.out.println("the greatest :" +d);
		}

		
		//2. Write a Java program to test a number is positive or negative.
		

		
		int num =35;
		int num1=-11;
		
			
		 if (num>0) 
		 {
			
			 System.out.println(num+  " positive number");
		 }
		 
		 if(num1<0)
		 {
			
			 System.out.println(num1+ " negative number"); 
		 }
		
		
			
		
	}

}
