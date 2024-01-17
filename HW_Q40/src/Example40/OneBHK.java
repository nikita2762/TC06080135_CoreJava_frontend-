package Example40;

class OneBHK {
    double roomArea;
    double hallArea;
    double price;

    // Default constructor
    OneBHK() {
        roomArea = 0.0;
        hallArea = 0.0;
        price = 0.0;
    }

    // Parameterized constructor
    OneBHK(double roomArea, double hallArea, double price) {
        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.price = price;
    }

    // Method to show OneBHK information
    void show() {
        System.out.println("Room Area: " + roomArea + " sq. ft.");
        System.out.println("Hall Area: " + hallArea + " sq. ft.");
        System.out.println("Price: $" + price);
    }
}

/*
40. Create class OneBHK with instance variable roomArea, hallArea and price

a. Create default and parameterized constructor;

b. Method show(): to print OneBHK data member information;

Create another class TwoBHK which has all the properties and behaviour of OneBHK and a new instance variable room2Area.

a. Create default and parameterized constructor;

b. Method show(): to print all data member information;

Write main function in another class (Say XYZ) and store three
 TwoBHK flat's information and print information using show method. Also print total amount of all flats.

*/