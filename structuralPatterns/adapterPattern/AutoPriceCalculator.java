package structuralPatterns.adapterPattern;

public class AutoPriceCalculator implements  PriceCalculator{
    private int km;
    private int baseFare = 50;
    private int perKmFare;

    public AutoPriceCalculator(int km, int perKmFare) {
        this.km = km;
        this.perKmFare = perKmFare;
    }

    @Override
    public String calculatePrice() {
        return  "Booking Amount is "+"Rs. "+(baseFare+ km * perKmFare);
    }
}
