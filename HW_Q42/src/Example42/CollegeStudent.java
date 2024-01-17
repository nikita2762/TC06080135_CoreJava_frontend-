package Example42;

public class CollegeStudent extends Student {
	
	int semester;
	
	public  CollegeStudent(int roll, float percentage,int semester) {
		super(roll,percentage);
		this.semester=semester;
		
	}

	@Override
	public void show() {
		super.show();
		System.out.println("Semester = "+semester);
	}
	
	

}
