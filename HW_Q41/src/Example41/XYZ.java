package Example41;

//XYZ class with main method
public class XYZ {
 public static void main(String[] args) {
	 
     // Creating two FullTimeFaculty and two PartTimeFaculty
	 
     FullTimeFaculty ft1 = new FullTimeFaculty(1, 50000, 5000);
     FullTimeFaculty ft2 = new FullTimeFaculty(1, 60000, 6000);
     
     PartTimeFaculty pt1 = new PartTimeFaculty(3, 20, 2500);
     PartTimeFaculty pt2 = new PartTimeFaculty(4, 15, 3000);

     // Accepting input and calculating salary for FullTimeFaculty and PartTimeFaculty
     ft1.acceptInput();
     ft2.acceptInput();
     
     pt1.acceptInput();
     pt2.acceptInput();

     // Displaying details for FullTimeFaculty
     System.out.println("Full-Time Faculty 1 Details:");
     ft1.display();
     
     System.out.println("\nFull-Time Faculty 2 Details:");
     ft2.display();

     // Displaying details for PartTimeFaculty
     System.out.println("\nPart-Time Faculty 1 Details:");
     pt1.display();
     
     System.out.println("\nPart-Time Faculty 2 Details:");
     pt2.display();
 }
}