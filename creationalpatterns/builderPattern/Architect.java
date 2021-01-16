package creationalpatterns.builderPattern;

import java.awt.*;

public class Architect {
    public static void main(String[] args) {
        // without builder pattern our normal way to create object of bedroom

        //builer pattern to instantiate object
        Bedroom bedroom1=new BedroomBuilder().setDimension(new Dimension(200,300)).setFloorNumber(1).setisDouble(true).setNoOfDoors(4).setNoOfWindows(2).createBedroom();


        //complete builder pattern

        Kitchen kitchen=new KitchenBuilder().setDimension(new Dimension(300,400)).setFloorNumber(2).createKitchen();
    }
}
