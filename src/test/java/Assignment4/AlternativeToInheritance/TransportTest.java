package Assignment4.AlternativeToInheritance;

import Assignment4.alternativeToInheritance.Car;
import Assignment4.alternativeToInheritance.MotorBike;
import Assignment4.alternativeToInheritance.Vehicle;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Tank on 3/30/2017.
 */
public class TransportTest {

    private Vehicle myVehicle;
    private Car myCar;
    private MotorBike bike;

    @Before
    public void setUp() throws Exception {
        myVehicle = new Vehicle();
        myCar = new Car(myVehicle,4);
        bike = new MotorBike(myVehicle);
    }

    @Test
    public void testTransport() throws Exception {
        myVehicle.move();
        System.out.print("\n\n");

        System.out.print("My " + myCar.getVehicleType() + " has " + myCar.getNumberOfSeats() + " seats" + " , " + myCar.getNumberOfWheels() + " wheels " + " and "+ myCar.getNumberOfDoors()+" doors."+ "\n");
        myCar.move();
        System.out.print("\n");
        myCar.drive();
        System.out.print("\n\n");

        System.out.print("My " + bike.getVehicleType() + " has " + bike.getNumberOfSeats() + " seat" + " and " + bike.getNumberOfWheels() + " wheels."+ "\n");
        bike.move();
        System.out.print("\n");
        bike.drive();
        System.out.print("\n\n");

    }

}
