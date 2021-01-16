package structuralPatterns.adapterPattern;

public class OlaBookingCustomer {
    public static void main(String[] args) {
        CabPriceCalculator cab1 = new CabPriceCalculator(10,20);
        OlaBookingCustomer.printPriceDetails(cab1);

        AutoPriceCalculator auto = new AutoPriceCalculator(20,10);
        OlaBookingCustomer.printPriceDetails(auto);

        BikePriceCalculator bike = new BikePriceCalculator(30,5);
        Adapter adapter = new Adapter(bike);
        OlaBookingCustomer.printPriceDetails(adapter);
    }
    public static void printPriceDetails(PriceCalculator priceCalculator){
        System.out.println(priceCalculator.calculatePrice());
    }
}
