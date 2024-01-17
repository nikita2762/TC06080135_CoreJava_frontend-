// toString method =  str represention of an obj

public class Employee {
	private int empId;
	private String empName;
	private float empSal;
	
	public Employee()
	{
		System.out.println("Defualt constructor invoked");	
	}
	
	public Employee(int empId,String empName,float empSal)
	{
		System.out.println("Parametric constructor invoked");	
		this.empId=empId;
		this.empName=empName;
		this.empSal=empSal;
	}
	
	public String toString()
	{
		return "Employee =[" + empId +"  "+ empName + " "+ empSal+ "]";
	}
	
	public static void main(String args[])
	{
		Employee e= new Employee();
		System.out.println(e);
		
		Employee e1= new Employee(101,"Rahul",50000);
		System.out.println(e1);
		
	}
}
