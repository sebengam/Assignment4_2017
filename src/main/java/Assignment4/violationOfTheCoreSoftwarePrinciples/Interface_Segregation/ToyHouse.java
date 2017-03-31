package Assignment4.violationOfTheCoreSoftwarePrinciples.Interface_Segregation;

/**
 * Created by Tank on 3/27/2017.
 */
public class ToyHouse implements Toy {
    double price;
    public String color;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move() {
        System.out.print("Not all toys created can move!\n");
    }

    public void fly() {
        System.out.print("Not all toys created can fly!");
    }
}
