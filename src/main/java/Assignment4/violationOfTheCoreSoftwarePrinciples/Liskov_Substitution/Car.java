package Assignment4.violationOfTheCoreSoftwarePrinciples.Liskov_Substitution;

/**
 * Created by Tank on 3/27/2017.
 */
public class Car extends TransportationDevice {
    public Car() {
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.print("Car: Car engine started\n");

    }
}
