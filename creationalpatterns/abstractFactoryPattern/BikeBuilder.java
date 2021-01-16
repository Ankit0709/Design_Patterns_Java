package creationalpatterns.abstractFactoryPattern;

public class BikeBuilder {
    public static void main(String[] args) {
        BikeFactory factory = FactoryCreator.getBikeFactory("Mountain Bike");
        Tire tire1 = (Tire) factory.create("tire");
        tire1.description();
        Tire tire2 = (Tire) factory.create("tire");
        tire2.description();
        Handle handle = (Handle) factory.create("handle");
        handle.description();
    }
}
