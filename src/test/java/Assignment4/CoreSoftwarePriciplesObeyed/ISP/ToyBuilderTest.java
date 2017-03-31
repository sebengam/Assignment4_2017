package Assignment4.CoreSoftwarePriciplesObeyed.ISP;

import org.junit.Test;

/**
 * Created by Tank on 3/27/2017.
 */
public class ToyBuilderTest {
    @Test
    public void testBuildToyHouse() throws Exception {
        ToyHouse toyHouse = ToyBuilder.buildToyHouse();
        System.out.print(toyHouse);
    }

    @Test
    public void testBuildToyCar() throws Exception {
        ToyCar toyCar = ToyBuilder.buildToyCar();
        System.out.print(toyCar);
    }

    @Test
    public void testBuildToyPlane() throws Exception {
        ToyPlane toyPlane = ToyBuilder.buildToyPlane();
        System.out.print(toyPlane);
    }
}
