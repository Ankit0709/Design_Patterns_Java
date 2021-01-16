package creationalpatterns.builderPattern;

import java.awt.*;

public interface Builder {

    Builder setDimension(Dimension dimension);

    Builder setFloorNumber(int floorNumber);

    Builder setWallColor(Color wallColor);

    Builder setNoOfDoors(int doors);

    Builder setNoOfWindows(int windows);
}
