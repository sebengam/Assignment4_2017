package Assignment4.CoreSoftwarePriciplesObeyed.SRP;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Tank on 3/27/2017.
 */
public class TextTest {
    Text text;
    Printer printer;

    @Before
    public void setUp() throws Exception {
        text = new Text();
        printer = new Printer(text);
    }

    @Test
    public void testPrinter() throws Exception {
        text.setAuthor("Lindi Moses");
        text.setText("The love song");
        text.setLength(500);
        printer.printText();
    }
}
