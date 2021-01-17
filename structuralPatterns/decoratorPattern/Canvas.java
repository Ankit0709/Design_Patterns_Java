package structuralPatterns.decoratorPattern;

import javax.swing.*;
import java.awt.*;

public class Canvas extends  JPanel {

    Component circle1 = new Circle(0,10);
    Component circle2 = new Circle(60,10);
    Component circle3 = new Circle(120,10 );

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.add(new Canvas());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public void paint(Graphics graphics){
        circle1.draw(graphics);
        circle2 = new RedColoredBorder(circle2);
        circle2.draw(graphics);
        circle3.draw(graphics);
    }
}
