package creationalpatterns.builderPattern;

import java.awt.*;

public class BedroomBuilder implements Builder {
    private Dimension dimension;
    private int floorNumber;
    private Color wallColor;
    private int noOfDoors;
    private int noOfWindows;
    private boolean isDouble;
    private boolean hasEnsuite;

    @Override
    public BedroomBuilder setDimension(Dimension dimension){
        this.dimension = dimension;
        return this;
    }
    @Override
    public BedroomBuilder setFloorNumber(int floorNumber){
        this.floorNumber = floorNumber;
        return this;
    }
    @Override
    public BedroomBuilder setWallColor(Color wallColor){
        this.wallColor = wallColor;
        return this;
    }
    @Override
    public BedroomBuilder setNoOfDoors(int doors){
        this.noOfDoors =  doors;
        return this;
    }
    @Override
    public BedroomBuilder setNoOfWindows(int windows){
        this.noOfWindows = windows;
        return this;
    }
    public BedroomBuilder setisDouble(boolean isDouble){
        this.isDouble = isDouble;
        return this;
    }
    public BedroomBuilder sethasEnsuite(boolean hasEnsuite){
        this.hasEnsuite = hasEnsuite;
        return this;
    }
    public Bedroom createBedroom(){
        return new Bedroom(dimension,floorNumber,wallColor,noOfDoors,noOfWindows,isDouble,hasEnsuite);
    }
}
