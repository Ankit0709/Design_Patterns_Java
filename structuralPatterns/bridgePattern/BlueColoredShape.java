package structuralPatterns.bridgePattern;

import java.awt.*;

public class BlueColoredShape implements  ColoredShape{
    @Override
    public void setColor(Graphics graphics) {
        graphics.setColor(Color.BLUE);
    }
}
