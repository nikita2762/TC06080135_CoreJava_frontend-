package dayfour;

public class B extends A {
@Override	
	public void m1()
	{
		System.out.println("in m1() of B");
	}
	public void m2() {
		System.out.println("In m2() of b");
	}
	
	public static void main(String args[]) {
		A b = new B();		//it will occur only when inhertited class is present(extends)
		//System.out.println(b.no);//CTE
		b.getNo();
		b.m1();
		((B) b).m2();		//not overriden method
		
		System.out.println(b instanceof A); // instanceof - check obj of class
		System.out.println(b instanceof B);

	}
}
