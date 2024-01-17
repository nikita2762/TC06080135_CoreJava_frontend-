
public class Addition {
	
	public void add(int a,int b)
	{
		System.out.print("sum = " + (a+b));
	}
//	public void add(int a,int b,int c)
//	{
//		int sum=a+b+c;
//	    System.out.println("Sum = "+sum);
//	}
	
	public int add(int... a) //elipses
	{
		int count=a.length;
		int sum=0;
		System.out.println("Count = "+ count);
//		for (int i=0;i<a.length;i++)
//		{
//			sum+=a[i];
//		}
		
		for(int i:a)  // for each loop
		{
			sum += i;
		}
		return sum;
		
	}

	public static void main(String[] args) {
		Addition a= new Addition();
		System.out.println("Addition = " +a.add(1,2,3));
		
        a.add(3,7);
	}

}
