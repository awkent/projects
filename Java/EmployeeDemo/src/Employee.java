package employee;
/**
 * Written by Aaron Kent
 * Chapter 3
 * Assignment 1: Employee Class
 *
 * The Employee class stores data about an employee.
 */

public class Employee
{
	// Fields
	private String name;			// Employee's name
	private int idNumber;		// ID number
	private String department;	// Employee's department
	private String position;	// Job title

	/**
	 *Constructorthat accepts employee name and ID
	 *then initializes department and position to empty
	 */

	 public Employee(String n, int id)
	 {
		this(n, id, "", "");
	 	/**idNumber = id;
	 	*department = "";
	 	*position = "";
	 	*/
	 }

	/**
	 *No argument constructor
	 */

	 public Employee()
	 {
		 this("", 0, "", "");
	   /**name = "";
		*idNumber = 0;
		*department = "";
		*position = "";\
		*/
	 }

	/**
	*Constructor which accepts values as arguments
	*for all four fields
	*/

	public Employee(String n, int id, String dept, String pos)
	{
		name = n;
		idNumber = id;
		department = dept;
		position = pos;
	}

	
	/**
	 * The setName method accepts an argument
	 * which is stored in the name field.
	 */

	public void setName(String n)
	{
		name = n;
	}

	/**
	 * The setIdNumber method accepts an argument
	 * which is stored in the idNumber field.
	 */

	public void setIdNumber(int num)
	{
		idNumber = num;
	}

	/**
	 * The setDepartment method accepts an argument
	 * which is stored in the department field.
	 */

	public void setDepartment(String d)
	{
		department = d;
	}

	/**
	 * The setPosition method accepts an argument
	 * which is stored in the position field.
	 */

	public void setPosition(String p)
	{
		position = p;
	}

	/**
	 * The getName method returns the value in
	 * the name field.
	 */

	public String getName()
	{
		return name;
	}

	/**
	 * The getIdNumber method returns the value in
	 * the idNumber field.
	 */

	public int getIdNumber()
	{
		return idNumber;
	}

	/**
	 * The getDepartment method returns the value in
	 * the department field.
	 */

	public String getDepartment()
	{
		return department;
	}

	/**
	 * The getPosition method returns the value in
	 * the position field.
	 */

	public String getPosition()
	{
		return position;
	}
	
	/**
	 * toString method to create a pretty version
	 * of employee string output
	 */
	
	public String toString()
	{
		String objStr = "";
		
		objStr += "Name: " + getName() + "\n";
		objStr += "ID Number: " + getIdNumber() + "\n";
		objStr += "Department: " + getDepartment() + "\n";
		objStr += "Position: " + getPosition() + "\n";
		
		return objStr;
	}
	
	
}
