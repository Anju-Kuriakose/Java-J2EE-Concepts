package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar=new ArrayList();
		
		
		ar.add(100);
		ar.add(200);
		System.out.println(ar.size());//gives length or size of the arraylist
		
		ar.add(300);
		ar.add(400);
		System.out.println(ar.size());//output will be 4
		
		ar.add(500);
		ar.add(600);
		System.out.println(ar.size());//output will be 6
		System.out.println(ar.get(0));// value at index position 0 :100
		System.out.println(ar.get(4));//value at index position 4 is 500
		//System.out.println(ar.get(6));//IndexOutofBoundException
		
		ar.remove(4);
		System.out.println(ar.get(4));
		System.out.println(ar.size());
		//to print all values from an arraylist
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		//datatypes or generics based arrylist
		
		ArrayList<String> studentList=new ArrayList<String>();//stores only string value
		
		studentList.add("Anju");
		studentList.add("Tinu");
		studentList.add("Sarah");
		
		ArrayList<Integer> studentMarks=new ArrayList<Integer>();//stores only integer values
		studentMarks.add(90);
		studentMarks.add(95);
		studentMarks.add(98);
		
		System.out.println(studentMarks.get(0));
		
		ArrayList<Object> empData=new ArrayList<Object>();//to store different types of data
		empData.add("Tom");
		empData.add(30);
		empData.add(12.33);
		empData.add(null);
		System.out.println(empData.size());
		System.out.println(empData.get(3));
		//Duplicate/null/blank values can be added to the arraylist.
		
	}

}
