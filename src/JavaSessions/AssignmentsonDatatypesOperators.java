package JavaSessions;

public class AssignmentsonDatatypesOperators {

	public static void main(String[] args) {
//1.	Write a Java program to print 'Hello' on screen and then print your name on a separate line.		
String str="Hello";
String str1="Anju";
System.out.println(str);
System.out.println(str1);

System.out.println("**************");
//2.Write a Java program to print the sum of two numbers. 
int i=74;
int j=36;
System.out.println(i+j);

System.out.println("**************");
//3.Write a Java program to divide two numbers and print on the screen. 

short s1=50;
short s2=3;
System.out.println(s1/s2);

System.out.println("**************");
//4.Write a Java program to print the result of the following operations. Change your test data accordingly.

int a=-2;
int b=9;
int c=5;
System.out.println (a+(b*c));

short a1=55;
short a2=9;
System.out.println((a1+a2)%a2);

//20 + -3*5 / 8 

short p=20;
short q=-3;
short r=5;
short s=8;

System.out.println( p+(q*r)/s);

//5 + 15 / 3 * 2 - 8 % 3 
short k=5;
short k1=3;
short k2=15;
short k3=2;
short k4=8;
System.out.println(k+k2/k1*k3-k4%k1);

System.out.println("**************");

//5.Write a Java program to compute the specified expressions and print the output. Go to the editor
//Test Data((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 

double d=25.5;
double d1=3.5;
double d2=40.5;
double d3=4.5;

System.out.println((d*d1-d1*d1)/(d2-d3));

	}
}
