/**
 * One object of class Employee stores the personal information for one
 * Employee.
 */

public class Employee implements Cloneable {

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
    /**
     * Returns clone of the Employee Object
     */
	@Override
	public Object clone() {

		try {
			return (Employee) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Clone Exception caught in Employee Class");
			return null;
		}
	}

	/**
	 * This code tests if the Employees in the original list and the clone are equal.  They should start
	 * out equal and then return false after one of them is changed
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double
				.doubleToLongBits(other.salary))
			return false;
		if (ssn == null) {
			if (other.ssn != null)
				return false;
		} else if (!ssn.equals(other.ssn))
			return false;
		return true;
	}

}