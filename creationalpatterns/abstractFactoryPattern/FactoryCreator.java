package creationalpatterns.abstractFactoryPattern;

public  class FactoryCreator {
    public  static BikeFactory getBikeFactory(String type){
        switch (type){
            case "Mountain Bike":return new MountainBikeFactory();
            case "Road Bike":return new RoadBikeFactory();
            default:return null;
        }
    }

}
