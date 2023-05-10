public class Summery extends Home{
    private int seaDistance;

    public Summery(double price, int squareMeters, int seaDistance, int roomNumber, int hallNumber) {
        super(price, squareMeters, roomNumber, hallNumber);
        this.seaDistance = seaDistance;
    }

    public int getSeaDistance() {
        return seaDistance;
    }
}
