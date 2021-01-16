package structuralPatterns.bridgePattern;

import java.awt.*;

public class GreenColoredShape implements  ColoredShape {
    @Override
    public void setColor(Graphics graphics) {
        graphics.setColor(Color.GREEN);
    }
}
