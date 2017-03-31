package Assignment4.CoreSoftwarePriciplesObeyed.DIP;

/**
 * Created by LILO on 2016/03/24.
 */
public class LightBulb implements Switchable {
    public void turnOn() {
        System.out.println("LightBulb: Bulb turned on...");
    }

    public void turnOff() {
        System.out.println("LightBulb: Bulb turned off...");
    }
}
