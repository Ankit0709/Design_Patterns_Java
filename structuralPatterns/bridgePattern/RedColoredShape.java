package structuralPatterns.bridgePattern;

import java.awt.*;

public class RedColoredShape implements  ColoredShape{
    @Override
    public void setColor(Graphics graphics) {
        graphics.setColor(Color.RED);
    }
}
