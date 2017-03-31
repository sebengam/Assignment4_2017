package Assignment4.violationOfCoreSoftwarePrinciples.Dependency_Inversion;

import Assignment4.violationOfTheCoreSoftwarePrinciples.Dependency_Inversion.ElectricPowerSwitch;
import Assignment4.violationOfTheCoreSoftwarePrinciples.Dependency_Inversion.LightBulb;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Tank on 3/27/2017.
 */
public class ElectricPowerSwitchTest {
    LightBulb bulb;
    ElectricPowerSwitch powerSwitch;

    @Before
    public void setUp() throws Exception {
        bulb = new LightBulb();
        powerSwitch = new ElectricPowerSwitch(bulb);

    }

    @Test
    public void testPress() throws Exception {
        powerSwitch.press();
    }
}
