package structuralPatterns.bridgePattern;

import java.awt.*;

public   class Square implements Shape {
    ColoredShape coloredShape;

    public Square(ColoredShape coloredShape) {
        this.coloredShape = coloredShape;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.fillRect(100,10,50,50);
    }
}
