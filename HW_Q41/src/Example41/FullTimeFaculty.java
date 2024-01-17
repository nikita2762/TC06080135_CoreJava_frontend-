package Example41;

public class FullTimeFaculty extends Faculty{
	 double basic;
	    double allowance;

	    // Parameterized constructor
	    FullTimeFaculty(int facultyId, double basic, double allowance) {
	    	
	        super(facultyId, 0); // Salary is calculated in FullTimeFaculty, so passing 0 initially
	        this.basic = basic;
	        this.allowance = allowance;
	    }

	    // Method to accept input and calculate salary
	    void acceptInput() {

	    	salary = basic - allowance;
	    }
	}

