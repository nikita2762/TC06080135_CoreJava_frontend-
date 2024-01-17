package Example40;

public class XYZ {
    public static void main(String[] args) {
        // Creating three TwoBHK flats
        TwoBHK flat1 = new TwoBHK(600, 300, 50000, 550);
        TwoBHK flat2 = new TwoBHK(700, 350, 60000, 600);
        TwoBHK flat3 = new TwoBHK(750, 400, 70000, 650);

        // Printing information using show method
        System.out.println("Flat 1 Information:");
        flat1.show();
        System.out.println("\nFlat 2 Information:");
        flat2.show();
        System.out.println("\nFlat 3 Information:");
        flat3.show();

        // Calculating and printing total amount of all flats
        double totalAmount = flat1.price + flat2.price + flat3.price;
        System.out.println("\nTotal Amount of all Flats: $" + totalAmount);
    }
}