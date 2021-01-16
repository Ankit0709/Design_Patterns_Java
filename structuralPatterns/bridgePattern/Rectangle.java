package structuralPatterns.bridgePattern;

import java.awt.*;

public class Rectangle implements Shape{
    ColoredShape coloredShape;

    public Rectangle(ColoredShape coloredShape) {
        this.coloredShape = coloredShape;
    }

    @Overrideammi
    public void draw(Graphics graphics) {
        graphics.fillRect(5,10,50,100);
    }
}
