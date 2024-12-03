public class Furnished_apartment extends Property{
    private int qualityScale;
    Furnished_apartment(double price, String neighborhood, double area, int NumberOfBedrooms, int qualityScale) {
        super(price, neighborhood, area, NumberOfBedrooms);
        this.qualityScale = qualityScale;
    }
    public void setQualityScale(int qualityScaling) {
        while(true) {
            if (qualityScale < 0 || qualityScale >= 5) {
                qualityScale = qualityScaling;
                break;
            }
            else {
                System.out.println("the scale should be between 1 to 5");
            }
        }
    }
    public int getQualityScale() {
        return qualityScale;
    }
    @Override
    public void display() {
        System.out.println("Furnished Apartment: ");
        super.display();
        System.out.println("Quality Scale: " + qualityScale);
        System.out.println("--------------------------------");

    }

}
