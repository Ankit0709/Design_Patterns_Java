package structuralPatterns.bridgePattern;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.add(new Canvas());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
      Square square = new Square(new GreenColoredShape());
      square.draw(graphics);
      Triangle triangle = new Triangle(new RedColoredShape());
      triangle.draw(graphics);
      Rectangle rectangle = new Rectangle(new BlueColoredShape());
      rectangle.draw(graphics);
    }
}
