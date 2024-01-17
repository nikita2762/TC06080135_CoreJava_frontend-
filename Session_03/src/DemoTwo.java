// getter and setter
//right click -> source -> generate getter and setter

public class DemoTwo {
	
	private int dd,mm,yy;

	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}
	
	public static void main(String args[])
	{
		DemoTwo d= new DemoTwo();
		
		d.setDd(17);
		int day =d.getDd();
		System.out.println("d = "+ d.getDd());
	}
}
