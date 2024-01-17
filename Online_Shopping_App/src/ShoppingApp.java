import java.util.*;

public class ShoppingApp {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the account type: 1.Prime Account or 2.Normal Account ");
	int AccType = sc.nextInt();

	ShopFactory shopFactory = new GSShopFactory();																																						

   PrimeAcc primeAcc = shopFactory.getNewPrimeAcc(1, " Nikita ", 100, true);

   NormalAcc normalAcc = shopFactory.getNewNormalAcc(2, " Amruta ", 70, 10);

   if(AccType ==1) {
	   
	   primeAcc.bookProduct();
	   
	   System.out.println("Prime Account Details: " + primeAcc.toString());
   }
   else if(AccType==2) {
	   
	   normalAcc.bookProduct();
	   
	   System.out.println("Normal Account Details: " + normalAcc.toString());

   }
   else {
	   System.out.println("Enter valid AccType");

   }
     
}
}