public class Home {
    private double price;
    private int squareMeters;
    private int roomNumber;
    private int hallNumber;

    public Home(double price, int squareMeters, int roomNumber, int hallNumber) {
        this.price = price;
        this.squareMeters = squareMeters;
        this.roomNumber = roomNumber;
        this.hallNumber = hallNumber;
    }

    public double getPrice() {
        return price;
    }

    public int getSquareMeters() {
        return squareMeters;
    }
    public int getRoomNumber() {
        return roomNumber;
    }
    public int getHallNumber() {
        return hallNumber;
    }
}
