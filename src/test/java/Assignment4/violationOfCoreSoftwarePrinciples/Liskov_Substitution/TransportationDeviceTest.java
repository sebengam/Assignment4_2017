package Assignment4.violationOfCoreSoftwarePrinciples.Liskov_Substitution;

import Assignment4.violationOfTheCoreSoftwarePrinciples.Liskov_Substitution.Bicycle;
import Assignment4.violationOfTheCoreSoftwarePrinciples.Liskov_Substitution.Car;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Tank on 3/27/2017.
 */
public class TransportationDeviceTest {
    Car myCar;
    Bicycle myBike;

    @Before
    public void setUp() throws Exception {
        myCar = new Car();
        myBike = new Bicycle();

    }

    @Test
    public void testEngine() throws Exception {
        myCar.startEngine();
        myBike.startEngine();
    }
}
