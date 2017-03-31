package Assignment4.violationOfCoreSoftwarePrinciples.Single_Responsibility;

import Assignment4.violationOfTheCoreSoftwarePrinciples.Single_Responsibility.Text;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Tank on 3/27/2017.
 */
public class TextTest {
    Text text;

    @Before
    public void setUp() throws Exception {
        text = new Text();
    }

    @Test
    public void testText() throws Exception {
        text.setText("The Amazing Spider man");
        text.setAuthor("Amy Smith");
        text.setLength(250);
        //text.printText();
    }
}
