package creationalpatterns.abstractFactoryPattern;

public class MountainBikeHandle extends  Handle {
    private  final String shape = "FLAT";


    @Override
    public void description() {
        System.out.println("Mountain Bike has "+shape+" handle.");

    }
}
