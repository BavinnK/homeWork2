public class Villa extends Property {
    private boolean hasSwimmingPool;
    private int numberadjacentStreet;
     Villa(double price, String neighborhood, double area, int NumberOfBedrooms, int NumberOfBathrooms,boolean hasSwimmingPool,int numberadjacentStreet){
        super(price, neighborhood, area, NumberOfBedrooms);
        this.hasSwimmingPool = hasSwimmingPool;
        this.numberadjacentStreet = numberadjacentStreet;

    }
    public boolean getHasSwimmingPool(){
        return hasSwimmingPool;
    }
    public int getNumberadjacentStreet(){
        return numberadjacentStreet;
    }
    public void setHasSwimmingPool(boolean hasSwimmingPool){
        this.hasSwimmingPool = hasSwimmingPool;
    }
    public void setNumberadjacentStreet(int numberadjacentStreet){
        this.numberadjacentStreet = numberadjacentStreet;
    }
    @Override
    public void display(){
        System.out.println("villa:");
        super.display();
        System.out.println("Has Swimming Pool: " + hasSwimmingPool);
        System.out.println("Number of Adjacent Streets: " + numberadjacentStreet);
        System.out.println("--------------------------------");
    }
}
