package JavaSessions;

public class ArrayConcept {

	public static void main(String[] args) {
		//array is used to store similar datatype values in a array variable
		//1.int array: can store only integer values
		
		int i[] =new int [4];//length/size of the array is 4
		i[0]=10;//lowest index value
		i[1]=20;
		i[2]=30;
		i[3]=40;//highest index value
		
		//length of the array=highest index+1
		//highest index= length of the array-1
		
		System.out.println(i[0]);
		System.out.println(i[0]+i[1]);
		
		//System.out.println(i[4]);//size of the array is i[3],i[4] will give ArrayOutOfBoundException
		
		int len=i.length;
		System.out.println(i.length);
		System.out.println("length of the array:" +len);
		
		//print all values of array using for loop
		
		for(int k=0;k<len;k++) {
			System.out.println(i[k]);
		}
			
			//2.Doble Array -we can store integer values in this array but not vice versa
			double d[]=new double[2];
			
			d[0]=12.33;
			d[1]=23.44;
					System.out.println(d[0]+d[1]);
					
					//3.Char Array
					
					char c[]=new char[3];
					c[0]='a';
					c[1]='b';
					c[2]='1';
					System.out.println(c[0+c[1]]);//out is a value based on ASCII value
					
					
		//	4.String Array
					String s[]=new String[3];
					s[0]="java";
					s[1]="python";
					s[2]="ruby";
					for(int p=0;p<s.length;p++)
					{
						System.out.println(s[p]);
					}
		/*To store multiple values like employee details,
		we have to create an Object Array(also a class).We can store diff datatype */
					
					Object obj[]=new Object[5];
					obj[0]="Deepak";
					obj[1]=25;
					obj[2]=12.33;
					obj[3]='M';
					obj[4]=true;
					for(int v=0;v<obj.length;v++)
					{
						System.out.println(obj[v]);
					}
					
		
	}

}
