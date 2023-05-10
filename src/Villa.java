public class Villa extends Home{
    private int gardenArea;

    public Villa(double price, int squareMeters, int gardenArea, int roomNumber, int hallNumber) {
        super(price, squareMeters, roomNumber, hallNumber);
        this.gardenArea = gardenArea;
    }

    public int getGardenArea() {
        return gardenArea;
    }
}
