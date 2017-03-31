package Assignment4.CoreSoftwarePriciplesObeyed.SRP;

/**
 * Created by Tank on 3/27/2017.
 */
public class Text {
    private String text;
    private String author;
    private int length;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

}
