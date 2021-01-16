package creationalpatterns.abstractFactoryPattern;

public class MountainBikeFactory extends BikeFactory{

    public BikePart create(String type) {
        if(type.equals("tire")){
            return new MountainBikeTire();
        }
        else if(type.equals("handle")){
            return new MountainBikeHandle();
        }
        else{
            return null;
        }
    }
}
