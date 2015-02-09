/**
 * This is a test driver for the employees LinkedList
 */

public class EmployeeTestList implements Cloneable {
	public static void main(String[] args) {
		EmployeeArray myList1;

		myList1 = new EmployeeArray(5);

		Employee employee1 = new Employee("Exene Cervenka", "123123", 10000.0);
		myList1.addEmployee(employee1);

		Employee employee2 = new Employee("Mick J", "134343", 20000.0);
		myList1.addEmployee(employee2);

		EmployeeArray myList2 = (EmployeeArray) myList1.clone();

		System.out.println("This is list one:\n");
		System.out.println(myList1.toString());

		System.out.println("This is list is the clone:\n");
		System.out.println(myList2.toString());
		
		employee1.setSalary(3000000);
		
		System.out.println("This is list one after salary change:\n");
		System.out.println(myList1.toString());
		
		System.out.println("This is list is the clone after original list was changed:\n");
		System.out.println(myList2.toString());
		
		System.out.println(myList2 != myList1);
		System.out.println(myList2.getClass() == myList1.getClass());
		System.out.println(myList2.equals(myList1));

		Employee employee3 = new Employee("Axl R", "123123", 10000.0);
		myList1.addEmployee(employee3);
		
		System.out.println("This is list1 after with new employee:\n");
		System.out.println(myList1.toString());
		
		System.out.println("This list is the clone:\n");
		System.out.println(myList2.toString());
		
		Employee employee4 = new Employee("Eddie V", "123123", 10000.0);
	
		myList2.addEmployee(employee4);
		
		System.out.println("This is list1 after new employee was added to clone:\n");
		System.out.println(myList1.toString());
		
		System.out.println("This list is the clone with new employee:\n");
		System.out.println(myList2.toString());
		
		System.out.println(myList2 != myList1);
		System.out.println(myList2.getClass() == myList1.getClass());
		System.out.println(myList2.equals(myList1));
		/* 
		
		 */
	}
}
