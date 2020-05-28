package OOPEncapsulation;//encapsulation means data hiding
//If a data member is declared "private", then it can only be accessed within the same class. No outside class can access data member of that class.
public class Employee {
	
	public String name;
	public int age;
	private int salary;
	
	//class variable salary is set private hence it is not accessible outside of the employee class
	//we can access these private properties of this class by creating a public method of this variables.
	//use public getter and setter methods 
//Getter and Setter's methods are used to create, modify, delete and view the variables values.
	
	public Employee(String name, int age, int salary) {//constructor is created
		//super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	
	public void getAddress() {
		System.out.println("employee address");
	}
	
	private void getBankAccount() {//we can create a public method for private methods as we did for private class variable salary
		System.out.println("employee bank details");
	}
	public void getEmployeeBankData() {
		getBankAccount();
	}
	public int getSalary() {
		return salary;
	}

	public static void main(String[] args) {
	Employee e1=new Employee("Tom",25,1000);
    System.out.println(e1.name);
    System.out.println(e1.age);
    System.out.println(e1.salary);
	}
	}
