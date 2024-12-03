import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
RealEstate rl=new RealEstate();
Property vl=new Villa(230000,"TuyMalik",1200,9,12,true,3);
Property fl=new Furnished_apartment(70000,"ChwarChra",200,4,3);
Property ap=new Apartment(70000,"Kurdsat",150,3,3,true);

rl.setProperties(vl);
rl.setProperties(fl);
rl.setProperties(ap);
        System.out.println("\nhere is all the properies: ");
        rl.display();

        System.out.println("enter the name of the property you want to sell: ");
        rl.selling(vl);
        System.out.println("the updated properties: ");
        System.out.println("------------------------");
        rl.display();


    }
}