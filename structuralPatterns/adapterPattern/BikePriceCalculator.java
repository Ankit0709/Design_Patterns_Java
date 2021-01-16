package structuralPatterns.adapterPattern;

public class BikePriceCalculator {
     int km;
     int baseFare = 50;
     int perKmFare;

    public BikePriceCalculator(int km, int perKmFare) {
        this.km = km;
        this.perKmFare = perKmFare;
    }
    public float calculatePrice() {
        return (baseFare+ km * perKmFare);
    }
}
