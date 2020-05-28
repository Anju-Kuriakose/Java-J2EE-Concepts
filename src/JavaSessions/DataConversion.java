package JavaSessions;

public class DataConversion {

	public static void main(String[] args) {
		
		String x="100";
		System.out.println(x+20);//10020
		//if String x="100A"; output will be number format exception,as parsing can be done only with numeric values.
		
		String x1="200A";
		//System.out.println(x1.trim().replace("A", " "));//output is 200
		String x2=(x1.trim().replace("A", ""));
		
          System.out.println(x2+20);//output is 20020
		
		//String to int conversion
		
          String x3=x2;
         int j =Integer.parseInt(x3);
          
          System.out.println(j+20);//output is 220
          
          
		int i=Integer.parseInt(x);
		
		System.out.println(i+20);//output is 120 addition will take place
		
		//String to double
		
		String y="12.33";
		System.out.println(y+20);//12.3320
		
		double d=Double.parseDouble(y);
		System.out.println(d+20);//32.33
		
		//int to String
		
		int p=100;
		System.out.println(p+20);//output is 120
		
		String p1=String.valueOf(p);
		System.out.println(p1+20);//10020
		
		
		
		
	}

}
