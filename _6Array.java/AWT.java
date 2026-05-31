import java.awt.*;

public class AWT {
    public static void main(String[] args) {
        Frame frame = new Frame("My First AWT App");

        Label label = new Label("Hello, AWT!");
        label.setBounds(50, 100, 100, 30);

        frame.add(label);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}