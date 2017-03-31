package Assignment4.violationOfTheCoreSoftwarePrinciples.Liskov_Substitution;

/**
 * Created by Tank on 3/27/2017.
 */
public class Bicycle extends  TransportationDevice{
    public Bicycle() {
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.print("Bicycle: Bicycles do not have engines");
    }
}
