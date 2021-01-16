package creationalpatterns.abstractFactoryPattern;

public class MountainBikeTire extends  Tire{
    private  final String shape = "WIDE";
    private final String pressure = "MEDIUM";


    @Override
    public void description() {
        System.out.println("Tire of Mountain Bike has "+shape+" shape and pressure "+pressure);

    }
}
