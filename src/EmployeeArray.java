
/**
 *  One object of this class stores a list of Employee objects. All types of Employee objects can 
 *  be stored in the list.
 */
public class EmployeeArray implements Cloneable{
	private Employee[] employeeArray;
	private int nextEmptySpot;
		
	/**
	 * Constructor allocates a new Employee array with room for maxNumberOfEmployees
	 */
	public EmployeeArray(int maxNumberOfEmployees) {
		employeeArray = new Employee [maxNumberOfEmployees];
		nextEmptySpot = 0;
	}
		
	/**
	 *  Adds a newEmp object to the EmployeeArray and increments the counter. 
	 * Throws an Exception if there is no more room in the array.
	 */
	public void addEmployee(Employee newEmp) {
		if (nextEmptySpot == employeeArray.length)
			throw new ArrayIndexOutOfBoundsException("Cannot add new Employee objects - EmployeeList is full");
		employeeArray[nextEmptySpot] = newEmp;
		nextEmptySpot++;
	}
		
	/**
	 *  Returns the indexth Employee in the list.Throws an exception if the index is out of the array bounds.
	 */
	public Employee getEmployee(int index) {
		if (index >= employeeArray.length)
			throw new ArrayIndexOutOfBoundsException("Cannot return Employee object - array index is out of bounds");
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
	@Override public Object clone() {
		try {
			EmployeeArray result = (EmployeeArray) super.clone();
		result.employeeArray = employeeArray.clone();
		return result;
		} catch (CloneNotSupportedException e) {
		throw new AssertionError();
		}
		}
	/**
	 * Returns a String containing all the data in all the objects in the list
	 */
	public String toString() {
		String result = "";
		for (int i = 0; i < nextEmptySpot; ++i) {
			result+= employeeArray[i];
		}
		return result;
	}
}
