/**
 * This is a test driver and Main for the program
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
				
		System.out.println("This is the Original list:\n");
		System.out.println(myList1.toString());

		System.out.println("This is the Clone:\n");
		System.out.println(myList2.toString());
		
		System.out.println("From Java specifications (myList2 != myList1) should be true. Result: " + (myList2 != myList1) + "\n");
		System.out.println("From Java specifications (myList2.getClass() == myList1.getClass());) should be true. Result: " + (myList2.getClass() == myList1.getClass()) + "\n");
		System.out.println("From Java specifications (myList2.equals(myList1)) should be true, here. Result: " + (myList2.equals(myList1)) + "\n");

		employee1.setSalary(3000000);
		
		System.out.println("Original after salary change:\n");
		System.out.println(myList1.toString());
		
		System.out.println("Clone after original list was changed: \n");
		System.out.println(myList2.toString());
		
		System.out.println("From Java specifications (myList2 != myList1) should be true. Result: " + (myList2 != myList1) + "\n");
		System.out.println("From Java specifications (myList2.getClass() == myList1.getClass());) should be true. Result: " + (myList2.getClass() == myList1.getClass()) + "\n");
		System.out.println("From Java specifications (myList2.equals(myList1)) can be false, here. Result: " + (myList2.equals(myList1)) + "\n");

		Employee employee3 = new Employee("Axl R", "123123", 10000.0);
		myList1.addEmployee(employee3);
		
		System.out.println("Original after new employee was added:\n");
		System.out.println(myList1.toString());
		
		System.out.println("Clone after addition to Original:\n");
		System.out.println(myList2.toString());
		
		Employee employee4 = new Employee("Eddie V", "123123", 10000.0);
		myList2.addEmployee(employee4);
		
		System.out.println("Original after new employee was added to Clone:\n");
		System.out.println(myList1.toString());
		
		System.out.println("Clone with new employee:\n");
		System.out.println(myList2.toString());
		
		System.out.println("From Java specifications (myList2 != myList1) should be true. Result: " + (myList2 != myList1) + "\n");
		System.out.println("From Java specifications (myList2.getClass() == myList1.getClass());) should be true. Result: " + (myList2.getClass() == myList1.getClass()) + "\n");
		System.out.println("From Java specifications (myList2.equals(myList1)) can be false, here. Result: " + (myList2.equals(myList1)) + "\n");

		
		
	}
}
/*********
This is the Original list:

Name: Exene Cervenka
SSN#: 123123
Salary: $10000.0
Name: Mick J
SSN#: 134343
Salary: $20000.0

This is the Clone:

Name: Exene Cervenka
SSN#: 123123
Salary: $10000.0
Name: Mick J
SSN#: 134343
Salary: $20000.0

From Java specifications (myList2 != myList1) should be true. Result: true

From Java specifications (myList2.getClass() == myList1.getClass());) should be true. Result: true

From Java specifications (myList2.equals(myList1)) should be true, here. Result: true

Original after salary change:

Name: Exene Cervenka
SSN#: 123123
Salary: $3000000.0
Name: Mick J
SSN#: 134343
Salary: $20000.0

Clone after original list was changed: 

Name: Exene Cervenka
SSN#: 123123
Salary: $10000.0
Name: Mick J
SSN#: 134343
Salary: $20000.0

From Java specifications (myList2 != myList1) should be true. Result: true

From Java specifications (myList2.getClass() == myList1.getClass());) should be true. Result: true

From Java specifications (myList2.equals(myList1)) can be false, here. Result: false

Original after new employee was added:

Name: Exene Cervenka
SSN#: 123123
Salary: $3000000.0
Name: Mick J
SSN#: 134343
Salary: $20000.0
Name: Axl R
SSN#: 123123
Salary: $10000.0

Clone after addition to Original:

Name: Exene Cervenka
SSN#: 123123
Salary: $10000.0
Name: Mick J
SSN#: 134343
Salary: $20000.0

Original after new employee was added to Clone:

Name: Exene Cervenka
SSN#: 123123
Salary: $3000000.0
Name: Mick J
SSN#: 134343
Salary: $20000.0
Name: Axl R
SSN#: 123123
Salary: $10000.0

Clone with new employee:

Name: Exene Cervenka
SSN#: 123123
Salary: $10000.0
Name: Mick J
SSN#: 134343
Salary: $20000.0
Name: Eddie V
SSN#: 123123
Salary: $10000.0

From Java specifications (myList2 != myList1) should be true. Result: true

From Java specifications (myList2.getClass() == myList1.getClass());) should be true. Result: true

From Java specifications (myList2.equals(myList1)) can be false, here. Result: false


 */
