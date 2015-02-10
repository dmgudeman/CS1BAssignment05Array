import java.util.Arrays;

/**
 * One object of this class stores a list of Employee objects. All types of
 * Employee objects can be stored in the list.
 */
public class EmployeeArray implements Cloneable {
	private Employee[] employeeArray;
	private int nextEmptySpot;
	private int nextSpot;

	/**
	 * Constructor allocates a new Employee array with room for
	 * maxNumberOfEmployees
	 */
	public EmployeeArray(int maxNumberOfEmployees) {
		employeeArray = new Employee[maxNumberOfEmployees];
		nextEmptySpot = 0;
	}

	/**
	 * Adds a newEmp object to the EmployeeArray and increments the counter.
	 * Throws an Exception if there is no more room in the array.
	 */
	public void addEmployee(Employee newEmp) {
		if (nextEmptySpot == employeeArray.length)
			throw new ArrayIndexOutOfBoundsException(
					"Cannot add new Employee objects - EmployeeList is full");
		employeeArray[nextEmptySpot] = newEmp;
		nextEmptySpot++;
	}

	public void add(Employee newEmp) {
		nextSpot = 0;

		if (nextSpot < nextEmptySpot) {
			employeeArray[nextSpot] = newEmp;
			nextSpot++;
		}
	}

	/**
	 * Returns the indexth Employee in the list.Throws an exception if the index
	 * is out of the array bounds.
	 */
	public Employee getEmployee(int index) {
		if (index >= employeeArray.length)
			throw new ArrayIndexOutOfBoundsException(
					"Cannot return Employee object - array index is out of bounds");
		else
			return employeeArray[index];
	}

	/**
	 * Returns the number of Employees currently stored in the list.
	 */
	public int employeesFilled() {
		return nextEmptySpot;
	}

	/**
	 * Returns the maximum number of Employees that can be stored in the list.
	 */
	public int maximumEmployees() {
		return employeeArray.length;
	}
/**
 * Returns a deep clone of EmployeeArray object
 */
	@Override
	public Object clone() {
		try {
			EmployeeArray result = (EmployeeArray) super.clone();
			result.employeeArray = new Employee[employeeArray.length];
			for (int i = 0; i < employeeArray.length; i++) {
				if (employeeArray[i] != null) {
					result.employeeArray[i] = (Employee) employeeArray[i]
							.clone();
				}
			}
			return result;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
/**
 * Prints out all the objects in EmployeeArray
 */
	@Override
	public String toString() {
		String result = "";
		for (int i = 0; i < nextEmptySpot; ++i) {
			result += employeeArray[i];
		}
		return result;
	}

	/**
	 * Tests for equality in the EmployeeArray class by
	 * comparing elements in the arrays
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeArray other = (EmployeeArray) obj;
		if (!Arrays.equals(employeeArray, other.employeeArray))
			return false;
		if (nextEmptySpot != other.nextEmptySpot)
			return false;
		return true;
	}

}
