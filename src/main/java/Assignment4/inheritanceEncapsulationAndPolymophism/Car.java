package Assignment4.inheritanceEncapsulationAndPolymophism;

/**
 * Created by Tank on 3/30/2017.
 */
public class Car extends Vehicle {
    private int numOfDoors;

    public Car() {
    }

    public Car(int numOfSeats, int numOfWheels, String vehType, int numOfDoors) {
        super(numOfSeats, numOfWheels, vehType);
        this.numOfDoors = numOfDoors;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    @Override
    public int getNumberOfSeats() {
        return super.getNumberOfSeats();
    }

    @Override
    public int getNumberOfWheels() {
        return super.getNumberOfWheels();
    }

    @Override
    public String getVehicleType() {
        return super.getVehicleType();
    }

    @Override
    public void move() {
        System.out.print("A car is a good medium of transport.");
    }

    @Override
    public void drive() {
        System.out.print("You are driving a car.");
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
