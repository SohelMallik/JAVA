import java.awt.*;

public class FlowLayoutExample {
    public static void main(String[] args) {
        Frame f = new Frame("Layout Example");

        f.setLayout(new FlowLayout());

        f.add(new Button("One"));
        f.add(new Button("Two"));
        f.add(new Button("Three"));

        f.setSize(300, 200);
        f.setVisible(true);
    }
}
