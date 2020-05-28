package JavaSessions;

public class StringManipulation {
//String is a series of characters.
	
	public static void main(String[] args) {
		
		String str="This is my first java code and I am so happy";
		System.out.println(str.length());//gives the length of the string including characters and space between each characters
		
		//charAt() :method and provide the index whose character you need to find.
		
		System.out.println(str.charAt(4));//blank space
		System.out.println(str.charAt(5));//character'i' point to the character at specific index
		
		
		//indexOf() : if we know the length,this method help you determine the location of a specific character that you specify.
		
		System.out.println(str.indexOf('i'));//first occurrence of character i in the given string
		//System.out.println(str.indexOf('i'),fromIndex));
		
		System.out.println(str.indexOf('i',str.indexOf('i')+1));//second occurrence of character i
		//find third occurrence of i 
		System.out.println(str.indexOf('i',str.indexOf('i')+10));
		
		
		System.out.println(str.indexOf("testing"));//output is -1 for unavailable string
		
		System.out.println(str.indexOf("Java"));
		
		
		String message="welcome admin";
		if(message.indexOf("admin") >=0) {
			System.out.println("User is logged in");
		}
		
		//Trim() method
		//example 1
		String st="    hello  world    ";
		System.out.println(st.trim());//used to trim the spaces from both corners.
		
		//example 2
		//System.out.println(st.trim().replace(oldChar, newChar));
		String dob="01-01-1980";
		System.out.println(dob.replace("-", "/"));
		
		//LCASE AND UCASE
		
		String sc="This Is Java";
		System.out.println(sc.toLowerCase());
		System.out.println(sc.toUpperCase());
		
		//concat method 
		
		String a="Hello";
		String b="Selenium";
		System.out.println(a.concat(b)); 
		
		// Or we can use this method to concatenate 2 strings : System.out.println(a+b);
		
		//contains() :it act as a boolean expression
		
		String mesg="hey admin welcome to my portal";
		System.out.println(mesg.contains("admin"));//output is true
		
		
		//equals() :it act as a boolean expression
		
		String s1="This is my code";
		String s2="this is my code";
		System.out.println(s1.equals(s2));//output is false; checks for upper case and lower case letters too
		
		System.out.println(s1.equalsIgnoreCase(s2));//output is true;compares one string to another ignoring case considerations
		
			
		String browser="CHROME";
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("launch chrome");
		}
		
		//Substring :he substring begins at the specified beginIndex and extends to the character at index endIndex - 1.It returns a new string that is a substring of this string. 
		//s.o.p(se.substring(beginIndex,endIndex);
		String se="Your transaction id is 12345";
		System.out.println(se.substring(0,10));//her from index 0 to index 9 
		//output is Your trans
		System.out.println(se.substring(0));
		System.out.println(se.substring(0,15));// index 0 to index14
		System.out.println(se.substring(5));
		
		
		System.out.println(se.substring(se.indexOf("is")+2));
		
		System.out.println(se.substring(se.indexOf("is")+2).trim());
		
		
		//Split() 
		String data="Tom;25;IBM;London;99999";
		String emp[]=data.split(";");
		
		System.out.println(emp.length);
		System.out.println(emp[0]);
		//to access and print all values in emp[] array
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i]);
		}
		
		String userCred="admin_admin123";
		String username=userCred.split("_")[0];
		String password=userCred.split("_")[1];
		
		System.out.println(username);
		System.out.println(password);
		
		String test="xXjavaXxXPythonxXXxXRuby";
		String testArr[]=test.split("xX");
		
		System.out.println("0.."+testArr[0]);
		System.out.println("1.."+testArr[1]);
		System.out.println("2.."+testArr[2]);
		System.out.println("3.."+testArr[3]);
		System.out.println("4.."+testArr[4]);
		
		//how to reverse a string
		
		String main="Selenium";
		String rev=" ";
		for(int i=main.length()-1;i>=0;i--) {
			rev=rev+main.charAt(i);
		}
		System.out.println(rev);
		
		//another method to reverse a string
		
		/*char c[]=main.toCharArray();
		for(int i=c.length-1;i>=0;i--) {
			rev=rev+main.charAt(i);
		}		
		System.out.println(rev);*/
		
		//another method using stringbuffer
		
		/*StringBuffer obj=new StringBuffer(main);
		System.out.println(obj.reverse());*/
	}

}
