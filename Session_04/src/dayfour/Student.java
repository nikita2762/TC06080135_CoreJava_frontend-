/*
	  create student arr in main method
	  generate default and parameterized constractor
	  //generate getters and toString
	   * 
	   in main method 
	   create arr - take size of arr from user
	   for i < len.arr
	   s[i] = new Studen(r,n,m1,m2,m3);
	   	   ask user to enter roll
	 */

package dayfour;
import java.util.*;

public class Student {
	private int roll;
	private String name;
	private int m1,m2,m3;
	
public int getRoll() {
		return roll;
	}

	public String getName() {
		return name;
	}

	public int getM1() {
		return m1;
	}

	public int getM2() {
		return m2;
	}

	public int getM3() {
		return m3;
	}

public static void main(String args[]) {

	
	Scanner sc =new Scanner(System.in);
	int size = sc.nextInt();
	Student arr[]=new Student[size];
	for(int i=0;i<size;i++) {
		System.out.println("Enter the rollNo");
		int rollNo=sc.nextInt();
		System.out.println();
		
	}
	
	int r= sc.nextInt();
}


}
