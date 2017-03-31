package Assignment4.CoreSoftwarePriciplesObeyed.LSP;

/**
 * Created by Tank on 3/27/2017.
 */
public class DeviceWithoutEngines extends TransportationDevice {
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public double getSpeed() {
        return super.getSpeed();
    }

    @Override
    public void setSpeed(double speed) {
        super.setSpeed(speed);
    }

    public void startMoving(){

    }
}
