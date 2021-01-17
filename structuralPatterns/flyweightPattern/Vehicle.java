package structuralPatterns.flyweightPattern;

public interface Vehicle {
    int[] getLocation();
    void setLocation(int latitude, int longitude);
    String getType();
}
