package Assignment4.CoreSoftwarePriciplesObeyed.LSP;

/**
 * Created by Tank on 3/27/2017.
 */
public class Bicycle extends DeviceWithoutEngines {
    @Override
    public void startMoving() {
        super.startMoving();
        System.out.print("Bicycle: Bicycle is moving");

    }
}
