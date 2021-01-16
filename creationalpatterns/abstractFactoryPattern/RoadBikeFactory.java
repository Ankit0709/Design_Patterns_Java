package creationalpatterns.abstractFactoryPattern;

public class RoadBikeFactory extends  BikeFactory {
    public BikePart create(String type) {
        if (type.equals("tire")) {
            return new RoadBikeTire();
        } else if (type.equals("handle")) {
            return new RoadBikeHandle();
        } else {
            return null;
        }
    }
}
