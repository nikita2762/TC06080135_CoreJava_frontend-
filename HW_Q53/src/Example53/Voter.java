//package Example53;
//
//public class Voter {
//	
//	int vid;
//	String name;
//	int age;
//	
//	public Voter(int vid,String name,int age) throws Exception  {
//		this.vid=vid;
//		this.name=name;
//		this.age=age;
//		
//		
//	}
//
//	public static void main(String[] args) throws Exception {
//		int age=2;
//		
//		if(age<18)
//		{
//			try {
//				throw new Exception();
//			}
//			catch (MyException e) {
//				System.out.println("Invalid age for voting"+e);
//			}
//		}
//		else {
//			System.out.println("Can vote");
//		}
//
//	}
//
//}
package Example53;

//import javax.imageio.IIOException;

public class Voter {

    int vid;
    String name;
    int age;

    public Voter(int vid, String name, int age) throws Exception {
        this.vid = vid;
        this.name = name;
        this.age = age;

        if (age < 18) {
            throw new Exception("Invalid age for voting");
        }
    }

    public static void main(String[] args) throws Exception {
        try {
            Voter v = new Voter(1, "John", 20);
            System.out.println("Can vote");
        } catch (Exception e) {
            System.out.println("Invalid age for voting: " + e.getMessage());
        }
    }
}
