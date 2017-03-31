package Assignment4.CoreSoftwarePriciplesObeyed.SRP;

/**
 * Created by Tank on 3/27/2017.
 */
public class Printer {
    Text text;

    public Printer(Text text) {
        this.text = text;
    }
    public void printText(){
        System.out.print("Text sent to printer to be printed");

    }
}
