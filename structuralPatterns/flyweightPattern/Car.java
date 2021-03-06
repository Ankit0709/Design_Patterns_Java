package structuralPatterns.flyweightPattern;

public class Car implements Vehicle{
    private int[] location = new int[2];

    @Override
    public int[] getLocation() {
        return location;
    }

    @Override
    public void setLocation(int latitude, int longitude) {
        location[0] = latitude;
        location[1] = longitude;
    }

    @Override
    public String getType() {
        return "Car";
    }
}
