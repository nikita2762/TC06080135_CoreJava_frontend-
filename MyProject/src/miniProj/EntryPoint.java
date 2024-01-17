package miniProj;

//Entry point for application part
public class EntryPoint {
public static void main(String[] args) {
   // a. Assign instance of GSShopFactory to ShopFactory reference.
   ShopFactory shopFactory = new GSShopFactory();																																						

   // b. Instantiate GSPrimeAcc and refer it through reference PrimeAcc.
   PrimeAcc primeAcc = shopFactory.getNewPrimeAcc(1, "ABC - Prime User", 100, true);

   // c. Instantiate GSNormalAcc and refer it through reference NormalAcc.
   NormalAcc normalAcc = shopFactory.getNewNormalAcc(2, "PQR - Normal User", 50, 10);

   // d. Invoke bookProduct() method.
   primeAcc.bookProduct();
   normalAcc.bookProduct();

   // e. Invoke toString() method.
   System.out.println("Prime Account Details: " + primeAcc.toString());
   System.out.println("Normal Account Details: " + normalAcc.toString());
}
}