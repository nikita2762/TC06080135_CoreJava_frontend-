package Example41;

class Faculty {
    int facultyId;
    double salary;

    // Parameterized constructor
    Faculty(int facultyId, double salary) {
        this.facultyId = facultyId;
        this.salary = salary;
    }

    // Method to display faculty data
    void display() {
        System.out.println("Faculty ID: " + facultyId);
        System.out.println("Salary: " + salary);
    }
}

/*41.

PartTimeFaculty (hour, rate) inherits class Faculty

Create three classes Faculty (facultyid, salary) FullTimeFaculty (basic, allowance) inherits class Faculty

Create a method for accepting input in FullTimeFaculty and PartTimeFaculty, but salary should not be accepted. 
Salary is calculated on the basis of (basic-allowance) for FullTimeFaculty and (hour*rate) for PartTimeFaculty.
 Also create method in above classes to display faculty data.

Create another class (say XYZ) for main method and store 2 fulltime and 2 parttime faculty information.
 Also print their details.
*/