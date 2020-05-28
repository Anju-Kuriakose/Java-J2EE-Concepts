package JavaSessions;

public class Student {
	String name;
	int age;
	
	public Student(String name, int age) {
		//super();
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		Student s1=new Student("Anu",42);
		Student s2=new Student("Arun",39);
		Student s3=new Student("Anju",34);
		System.out.println("--------1------------");
		System.out.println(s1.name+"   --1-- "+s1.age);
		System.out.println(s2.name+" "+s2.age);
		System.out.println(s3.name+" "+s3.age);
		
		s1=s2;//we can transfer the object references to one another
		//inthis case s1 is pointing to s2 and gets the s2 object reference and s2 remains same 
		System.out.println("--------2------------");
		System.out.println(s1.name+" "+s1.age);
		System.out.println(s2.name+" "+s2.age);
		System.out.println(s3.name+" "+s3.age);
		
		s2=s3;
		System.out.println("--------3------------");
		System.out.println(s1.name+" "+s1.age);
		System.out.println(s2.name+" "+s2.age);
		System.out.println(s3.name+" "+s3.age);
		
		s3=s1;
		System.out.println("--------4------------");
		System.out.println(s1.name+" "+s1.age);
		System.out.println(s2.name+" "+s2.age);
		System.out.println(s3.name+" "+s3.age);
		
		
	}

}
