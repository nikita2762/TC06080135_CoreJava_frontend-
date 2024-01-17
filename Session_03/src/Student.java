
public class Student {
	private int roll;
	private String name;
	private static int count;

	public Student() {}
	
	public Student(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
		count++;
	}
	
//	public static String getCount()
//	{
//		return "Count= " +count;
//	}
	
	public static int getCount()
	{
		return count;
	}
	
	public String toString() {
		return "Student [roll="	+ roll+", name=" +name+ "]";
	}
	static
	{
		System.out.println("static method call before main method");
		count=50;
	}
	
	
	public static void main(String args[])
	{
		System.out.println("main method");
		Student s1= new Student(1,"nik");
		Student s2= new Student(2,"resha");
		Student s3= new Student(3,"ekta");
		System.out.println("Student count = "+Student.getCount());
		
	}

}