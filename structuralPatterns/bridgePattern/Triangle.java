package structuralPatterns.bridgePattern;

import java.awt.*;

public  class Triangle implements Shape {
    ColoredShape coloredShape;

    public Triangle(ColoredShape coloredShape) {
        this.coloredShape = coloredShape;
    }
    @Override
    public void draw(Graphics graphics) {
      int[] x={10,20,30};
      int[] y={5,6,7};
      int n=3;
      graphics.fillPolygon(x,y,n);
    }
}
