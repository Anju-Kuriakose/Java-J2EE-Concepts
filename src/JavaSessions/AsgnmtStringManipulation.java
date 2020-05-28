package JavaSessions;

public class AsgnmtStringManipulation {

	public static void main(String[] args) {
		//1.Write a program to check two different strings equality.

		String s1="STRING MANIPULATION";
		String s2="String Manipulation";
		System.out.println(s1.equals(s2));//output is false; checks for upper case and lower case letters too
		
		System.out.println("******************************");
		//2.Remove all  spaces in a String . 
		
		String s3="        Hello      World      ";
		System.out.println(s3.trim().replace(" ", ""));
		
		System.out.println("******************************");
		
		//3. Write a program that will  print out last character and first character of a word.
		
		String str="This is a java application";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(25));
		
		System.out.println("******************************");
		
		//4.Write a program to verify a word or a character contains in the sentence.
		
		String word="This is my first java code";
		System.out.println(word.contains("java"));
		
		System.out.println("******************************");
		
		//5.Write a function/ method to reverse your own name.
		
		String name="ANJU V K";
		String rev=" ";
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
		
		System.out.println("******************************");
		
		//6.Write a program that gives you last half of the string.
		
		String sub="Your password reset successfully";
		System.out.println(sub.substring(19).trim());
		
		System.out.println("******************************");
		
		//7.Write a program to get the 3rd  “ e “ of the string .
		
		String str1="Welcome to Naveen Automation Lab!";
		System.out.println(str1.indexOf('e'));
		
		System.out.println(str1.indexOf('e',str.indexOf('e')+10));
		
		System.out.println("******************************");
		
		//8.Write a method which gives index of (-1) if string is not available. . it should return integer. if String is present, then it should return the specific index.
		
		String s="This is my first java code";
		
		System.out.println(s.indexOf("My"));
		
		System.out.println(s.indexOf("java"));
		
		System.out.println("******************************");
		
		//9.Write a program that breaks a whole string into small strings, and print out its all values . (Hint: split, loop) .
		
		String main="Rain Rain Go Away Come Again Another Day";
		String data[]=main.split("\\s");
		//stem.out.println(data.length);
		System.out.println(data[0]);
		for (int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}
		
		
		System.out.println("******************************");
		
		//10.Assume that a string consists of 3 words, print out the middle one. 
		
		String st="Naveen Automation Lab";
		String emp[]=st.split("\\s");
		
		System.out.println(emp[1]);
		
		System.out.println("******************************");
		
		//11. get only numeric part from this String:String s = "your transaction id is: 12345";
		
		String se="your transaction id is: 12345";
		System.out.println(se.substring(se.indexOf(":")+2).trim());
		
	}

}
