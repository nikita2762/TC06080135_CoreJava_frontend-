package Example42;

public class SchoolStudent extends Student {
	
	String classname;
	
	public SchoolStudent(int roll,float percentage,String string) {
	 
		super(roll, percentage);
	
		this.classname=string;
	}

	@Override
	public void show() {
		super.show();
        System.out.println("Class Name: " + classname);

	}
	
	
		
	
}
