package Assignment4.CoreSoftwarePriciplesObeyed.DIP;

/**
 * Created by Tank on 3/27/2017.
 */
public class Fan implements  Switchable{
    public void turnOn() {
        System.out.println("Fan: Fan turned on...");
    }

    public void turnOff() {
        System.out.println("Fan: Fan turned off...");
    }
}
