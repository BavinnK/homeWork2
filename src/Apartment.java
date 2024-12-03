public class Apartment extends Property{
    private int whichFloor;
    private boolean hasParkingSpot;

    public Apartment(double price, String neighborhood, double area, int NumberOfBedrooms, int whichFloor, boolean hasParkingSpot) {
        super(price, neighborhood, area, NumberOfBedrooms);
        this.whichFloor = whichFloor;
        this.hasParkingSpot = hasParkingSpot;
    }

    public int getWhichFloor() {
        return whichFloor;
    }

    public boolean getHasParkingSpot() {
        return hasParkingSpot;
    }
    public void setWhichFloor(int whichFloor) {
        this.whichFloor = whichFloor;
    }

    public void setHasParkingSpot(boolean hasParkingSpot) {
        this.hasParkingSpot = hasParkingSpot;
    }
    @Override
    public void display(){
        System.out.println("Apartment: ");
        super.display();
        System.out.println("Which floor: " + whichFloor);
        System.out.println("Has Parking Spot: " + hasParkingSpot);
        System.out.println("--------------------------------");
    }



}
