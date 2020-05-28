package JavaSessions;

public class AssignmentsOnArrays {

	public static void main(String[] args) {
		
		/*Question 1: Write a program to print the following pattern using for loop:

			00 01 02 03 04 05 06 07 08 09 
			10 11 12 13 14 15 16 17 18 19 
			20 21 22 23 24 25 26 27 28 29 
			30 31 32 33 34 35 36 37 38 39 */
		/*int i[]=new int [40];
		int num=0;
			
	for(int j=0;j<40;j++)
	{
		if (j<=9)				
		{
			System.out.print("0") ;
			
		}
		
		if(num>=10) {
			System.out.println("");
			num=0;
			
		}
		System.out.print(j+" ");
		num=num+1;
	
	}*/
	
	
	//Write a program to create a static Array, having following cricket data:
		//name, age, team name, DOB, gender, Strike Rate

	Object obj[]=new Object[6];
	obj[0]="Yuvraj Singh";
	obj[1]=39;
	obj[2]="India";
	obj[3]="12-Dec-1981";
	obj[4]='M';
	obj[5]=87.67;
	
	Object obj1[]=new Object[6];
	obj1[0]="Virat Kohli";
	obj1[1]=31;
	obj1[2]="India";
	obj1[3]="05-Nov-1988";
	obj1[4]='M';
	obj1[5]=93.15;
	
	Object obj2[]=new Object[6];
	obj2[0]="M S Dhoni";
	obj2[1]=38;
	obj2[2]="india";
	obj2[3]="07-Jul-1981";
	obj2[4]='M';
	obj2[5]=87.56;
	
	for(int i=0;i<obj.length;i++) {
	System.out.println(obj[i]);
			}
	System.out.println("\t");
	for(int j=0;j<obj1.length;j++) {
		System.out.println(obj1[j]);
	}
	System.out.println("\t");
	
	for(int k=0;k<obj.length;k++) {
		System.out.println(obj2[k]);
		
		}
	
		  
}
		
	}


