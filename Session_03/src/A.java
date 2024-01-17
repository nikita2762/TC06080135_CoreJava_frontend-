package p1;

public class A 
{
	/*
	// private 
	private  int no = 10;
	private void getNo()
	{
		System.out.println("no = " + no);
	}
	
	public static void main(String[] args) {
		A a = new A();
		System.out.println("no = " + a.no);
		a.getNo();
	}
	
	
	// default
		int no = 10;
		void getNo()
		{
			System.out.println("no = " + no);
		}
		
		public static void main(String[] args) {
			A a = new A();
			System.out.println("no = " + a.no);
			a.getNo();
		}
	*/
		

	// private 
		protected  int no = 10;
		protected void getNo()
		{
			System.out.println("no = " + no);
		}
		
		public static void main(String[] args) {
			A a = new A();
			System.out.println("no = " + a.no);
			a.getNo();
		}
	
}
