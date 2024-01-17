package Example40;

class TwoBHK extends OneBHK {
    double room2Area;

    // Default constructor
    TwoBHK() {
        super(); // Call OneBHK default constructor
        room2Area = 0.0;
    }

    // Parameterized constructor
    TwoBHK(double roomArea, double hallArea, double price, double room2Area) {
        super(roomArea, hallArea, price); // Call OneBHK parameterized constructor
        this.room2Area = room2Area;
    }

    // Overridden method to show TwoBHK information
    @Override
    void show() {
        super.show(); // Call OneBHK show method
        System.out.println("Room 2 Area: " + room2Area + " sq. ft.");
    }
}
