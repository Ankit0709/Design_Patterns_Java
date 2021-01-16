package creationalpatterns.builderPattern;

import java.awt.*;

public class Kitchen {
    private Dimension dimension;
    private int floorNumber;
    private Color wallColor;
    private int noOfDoors;
    private int noOfWindows;
    private boolean isDouble;
    private boolean hasEnsuite;

    public Kitchen(Dimension dimension, int floorNumber, Color wallColor, int noOfDoors, int noOfWindows, boolean isDouble, boolean hasEnsuite) {
        this.dimension = dimension;
        this.floorNumber = floorNumber;
        this.wallColor = wallColor;
        this.noOfDoors = noOfDoors;
        this.noOfWindows = noOfWindows;
        this.isDouble = isDouble;
        this.hasEnsuite = hasEnsuite;
    }
}
