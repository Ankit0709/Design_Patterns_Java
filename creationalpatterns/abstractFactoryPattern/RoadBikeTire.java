package creationalpatterns.abstractFactoryPattern;

public class RoadBikeTire extends Tire {
    private  final String shape = "NARROW";



    @Override
    public void description() {
        System.out.println("Tire of Road Bike has "+shape+" shape.");

    }
}
