/**
 * One object of class Employee stores the personal information for one
 * Employee.
 */

public class Employee implements Cloneable{
	
	private String name; // Holds the employee name

	/**
	 * sets the value of name to "newName"
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * returns the current value of name
	 */
	public String getName() {
		return name;
	}

	private String ssn;

	/**
	 * sets the value of ssn to "newSsn"
	 */
	public void setSsn(String newSsn) {
		ssn = newSsn;
	}

	/**
	 * returns the current value of Ssn
	 */
	public String getSsn() {
		return ssn;
	}

	private double salary;

	/**
	 * sets the value of salary to "newSalary"
	 */
	public void setSalary(double newSalary) {
		salary = newSalary;
	}

	/**
	 * returns the current value of salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * default constructor for Employee class object which assigns default
	 * values for all class properties.
	 */
	public Employee() {
		this.setName("null");
		this.setSsn("000-00-0000");
		this.setSalary(0);
		
	}

	/**
	 * parameterized constructor for Employee class object which assigns values
	 * for all class properties based on the values sent into the parameters.
	 */
	public Employee(String name, String ssn, double salary) {
		this.setName(name);
		this.setSsn(ssn);
		this.setSalary(salary);
		

	}

	/**
	 * Returns a String containing all the data stored in this object.
	 */
	@Override
	public String toString() {
		String result = "Name: " + this.getName() + "\nSSN#: " + this.getSsn()
				+ "\nSalary: $" + this.getSalary() + "\n";
		return result;
	}


	@Override
	public Object clone() {
		Object copy;
		try{
		   copy = (Employee)super.clone();
		   ((Employee) copy).setName(name);
		   ((Employee) copy).setSsn(ssn);
		   ((Employee) copy).setSalary(salary);
	  
		} catch (CloneNotSupportedException e){
		   copy = null;
	   }
		return copy;
   } 
}