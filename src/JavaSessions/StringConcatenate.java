package JavaSessions;

public class StringConcatenate {

	public static void main(String[] args) {

int a=100;
int b=200;

double d1=12.33;
double d2=23.33;

String x="Hello";
String y="World";

System.out.println(a+b); //output is 300

System.out.println(x+y);//output is HelloWorld

System.out.println(x+" "+y);//output is Hello World ;space is created between the values

System.out.println(a+x);//output is 100Hello

System.out.println(x+y+a+b);//HelloWorld100200

System.out.println(x+y+(a+b));// HelloWorld300

System.out.println(a+"\t"+b); //100    200

System.out.println(a+"\n"+b); //100
                              //200
System.out.println("the sum of a and b is:" +(a+b));//the sum of a and b is:300

System.out.println(d1+d2);//35.66

System.out.println(d1+d2+a+b);//335.65999999999997

System.out.println(d1+d2+x+y);//35.66HelloWorld

System.out.println(d1+d2+" "+x+y);//35.66 HelloWorld

System.out.println(a+b+x+y+d1+d2);//300HelloWorld12.3323.33

//strings can concatenate with any primitive datatype ;it will not do any arithmetic operation






	}

}
