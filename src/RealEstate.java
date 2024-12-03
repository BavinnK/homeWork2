import java.util.ArrayList;
import java.util.List;

public class RealEstate {
    List<Property> properties = new ArrayList<Property>();
    public int getProperties() {
       return properties.size();
    }
    public void setProperties(Property property) {
        if (properties.size()>=0 && properties.size()<=100){
            properties.add(property);
            System.out.println("property added! ");}
        else {
            System.out.println("You cannot add more than 100 properties");
        }

    }
    public void selling(Property property) {
       if(properties.contains(property)) {
           properties.remove(property);
            System.out.println("property has been sold! ");}
        else
            System.out.println("property not found!");
    }

    public void display() {
        for (Property property : properties) {
            property.display();
        }
    }
}
