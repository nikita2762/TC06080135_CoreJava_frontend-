package another_psc;

//import java.util.Date;

public class Employee {
	private int empID;
	private String empName;
	private Date dt_of_joining;
	
	// generate default..parameterized constructor and toString()
	public Employee() {}
	
	public Employee(int empID, String empName, Date dt_of_joining) {
		this.empID = empID;
		this.empName = empName;
		this.dt_of_joining = dt_of_joining;
	}

//	@Overide
	public String toString() {
		return "Employee [ empId = " +empID + ", empName = " + empName + ", dt_of_joining = "
				+ dt_of_joining + "]";
	}

	public static void main(String[] args)
	{		
		Employee  e = new Employee(111,"Resha", new Date(19,10,2023));
		System.out.println(e);
		
	}
}