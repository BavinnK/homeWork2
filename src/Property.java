public class Property {
    private double price;
    private String neighborhood;
    private double area;
    private int NumberOfBedrooms;

    Property(double price, String neighborhood, double area, int NumberOfBedrooms){
        this.price = price;
        this.neighborhood = neighborhood;
        this.area = area;
        this.NumberOfBedrooms = NumberOfBedrooms;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String getNeighborhood(){
        return neighborhood;
    }
    public void setNeighborhood(String neighborhood){
        this.neighborhood = neighborhood;
    }
    public double getArea(){
        return area;
    }
    public void setArea(double area){
        this.area = area;
    }
    public int getNumberOfBedrooms(){
        return NumberOfBedrooms;
    }
    public void setNumberOfBedrooms(int NumberOfBedrooms){
        this.NumberOfBedrooms = NumberOfBedrooms;


    }
    public void display(){
        System.out.println("Price: " + price + "\n Neighborhood: " + neighborhood + "\n Area in Square Meters: " + area + "\n Number of Bedrooms: " + NumberOfBedrooms);



    }
}
