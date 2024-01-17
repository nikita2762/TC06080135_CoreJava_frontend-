
public class Demo {
	public int  d,m,y; // instance variable-get memory at time of obj creation
	public void intiData()
	{
		d=m=y=1;
	}
	public void setDate(int dd,int mm,int yy) // local var dd,mm,yy - scope is limited to that block
	{
		d=dd;
		m=mm;
		y=yy;
	}
	public void displayData()
	{
		System.out.println("Date =["+d+"/"+m+"/"+y+"]");
	}
	public static void mina(String args[])
	{
		Demo d;
		d=new Demo();
		
		d.intiData();
		d.displayData();
		d.setDate(27, 10, 2023);
		d.displayData();
	}
}
