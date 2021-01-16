package structuralPatterns.adapterPattern;

public class Adapter implements  PriceCalculator{
    BikePriceCalculator bikePriceCalculator;

    public Adapter(BikePriceCalculator bikePriceCalculator) {
        this.bikePriceCalculator = bikePriceCalculator;
    }

    @Override
    public String calculatePrice() {

        return  "Booking Amount is "+"Rs. "+(bikePriceCalculator.baseFare+ bikePriceCalculator.km * bikePriceCalculator.perKmFare);
    }
}
