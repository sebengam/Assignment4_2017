package Assignment4.CoreSoftwarePriciplesObeyed.LSP;

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
    public void testMovement() throws Exception {
        myCar.startEngine();
        myBike.startMoving();
    }
}
