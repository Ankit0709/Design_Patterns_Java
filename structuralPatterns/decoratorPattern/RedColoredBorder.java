package structuralPatterns.decoratorPattern;

import java.awt.*;

public class RedColoredBorder implements  Component{

    Component component;

    public RedColoredBorder(Component component) {
        this.component = component;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(Color.RED);
        component.draw(graphics);
        graphics.setColor(Color.BLACK);
    }
}
