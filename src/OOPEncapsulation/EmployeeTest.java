package OOPEncapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e1=new Employee("Tom",25,1000);
        System.out.println(e1.name);
        System.out.println(e1.age);
       // System.out.println(e1.salary);// as this property is private it can not accessible out of employee class
        
        //encapsulate this private property with a public layer and give it to the users.
        
        e1.getSalary();
        System.out.println(e1.getSalary());
        
        e1.getEmployeeBankData();
	}
}


