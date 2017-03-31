package Assignment4.inheritanceEncapsulationAndPolymophism;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Tank on 3/30/2017.
 */
public class TransportTest {
        private Car myCar;
        private MotorBike myBike;
        @Before
        public void setUp() throws Exception {
            myCar = new Car(4,4,"Car",4);
            myBike = new MotorBike(1,2,"Motor Bike");
        }

        @Test
        public void testTransport() throws Exception {
            System.out.print("My " + myCar.getVehicleType() + " has " + myCar.getNumberOfSeats() + " seats" + ", " + myCar.getNumberOfWheels() + " wheels" + " and " + myCar.getNumOfDoors()+ " doors." + "\n");
            myCar.move();
            System.out.print("\n");
            myCar.drive();
            System.out.print("\n\n");

            System.out.print("My " + myBike.getVehicleType() + " has " + myBike.getNumberOfSeats() + " seat" + "  and " + myCar.getNumberOfWheels() + " wheels." +  "\n");
            myBike.move();
            System.out.print("\n");
            myBike.drive();
            System.out.print("\n\n");

            Assert.assertEquals(myCar.getVehicleType(),"Car");
        }

}
