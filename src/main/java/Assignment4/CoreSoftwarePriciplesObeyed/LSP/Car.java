package Assignment4.CoreSoftwarePriciplesObeyed.LSP;

/**
 * Created by Tank on 3/27/2017.
 */
public class Car extends DeviceWithEngines {
    @Override
    public void startEngine() {
        super.startEngine();
        System.out.print("Car: Car engine started\n");

    }
}
