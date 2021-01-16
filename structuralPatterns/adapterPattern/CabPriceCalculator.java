package structuralPatterns.adapterPattern;

public class CabPriceCalculator implements  PriceCalculator {
    private int km;
    private int baseFare = 100;
    private int perKmFare;

    public CabPriceCalculator(int km,int perKmFare) {
        this.km = km;
        perKmFare = perKmFare;
    }

    @Override
    public String calculatePrice() {
        return  "Booking Amount is "+"Rs. "+(baseFare+ km * perKmFare);
    }
}
