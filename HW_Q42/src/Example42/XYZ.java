package Example42;

import Example42.CollegeStudent;
import Example42.SchoolStudent;
import Example42.Student;

public class XYZ
{
    public static void main(String[] args)
    {
        Student[] students = new Student[5];
        students[0] = new CollegeStudent(1, 50, 7);
        students[1] = new CollegeStudent(2, 73, 7);
        
        students[2] = new SchoolStudent(1, 92, "BE");
        students[3] = new SchoolStudent(2, 70, "TE");
        students[4] = new SchoolStudent(3, 78, "SE");

        for (Student student : students) {
            student.show();
            System.out.println("");
        }

        int count = 0;
        for (Student student : students) {
            if (student.percentage > 75) {
                count++;
            }
        }
        System.out.println("Number of students having A grade: " + count);
    }
}