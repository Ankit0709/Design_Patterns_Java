package creationalpatterns.abstractFactoryPattern;

public class RoadBikeHandle  extends  Handle{
    private  final String shape = "NARROW";


    @Override
    public void description() {
        System.out.println("Road Bike has "+shape+" handle.");

    }
}
