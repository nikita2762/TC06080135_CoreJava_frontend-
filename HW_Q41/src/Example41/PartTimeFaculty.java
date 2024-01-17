package Example41;

//PartTimeFaculty class inheriting from Faculty
	class PartTimeFaculty extends Faculty {
	    int hours;
	    double rate;

	    // Parameterized constructor
	    PartTimeFaculty(int facultyId, int hours, double rate) {
	        super(facultyId, 0); // Salary is calculated in PartTimeFaculty, so passing 0 initially
	        this.hours = hours;
	        this.rate = rate;
	    }

	    // Method to accept input and calculate salary
	    void acceptInput() {
	    	
	        salary = hours * rate;	
	    
	    }
}