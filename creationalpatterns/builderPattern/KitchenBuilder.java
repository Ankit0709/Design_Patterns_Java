package creationalpatterns.builderPattern;

import java.awt.*;

public class KitchenBuilder implements  Builder {
    private Dimension dimension;
    private int floorNumber;
    private Color wallColor;
    private int noOfDoors;
    private int noOfWindows;
    private boolean isDouble;
    private boolean hasEnsuite;
    @Override
    public KitchenBuilder setDimension(Dimension dimension) {
        this.dimension=dimension;
        return this;
    }

    @Override
    public KitchenBuilder setFloorNumber(int floorNumber) {
        this.floorNumber=floorNumber;
        return this;
    }

    @Override
    public KitchenBuilder setWallColor(Color wallColor) {
       this.wallColor=wallColor;
       return this;
    }

    @Override
    public KitchenBuilder setNoOfDoors(int doors) {
       this.noOfDoors=doors;
       return this;
    }

    @Override
    public KitchenBuilder setNoOfWindows(int windows) {
      this.noOfWindows=windows;
      return this;
    }
    public KitchenBuilder setisDouble(boolean isDouble){
        this.isDouble= isDouble;
        return this;
    }
    public KitchenBuilder sethasEnsuite(boolean hasEnsuite){
        this.hasEnsuite= hasEnsuite;
        return this;
    }
    public Kitchen createKitchen(){
        return new Kitchen(dimension,floorNumber,wallColor,noOfDoors,noOfWindows,isDouble,hasEnsuite);
    }
}
