package structuralPatterns.facadePattern;

import java.time.LocalDate;

public class FlightBooking {
    public void bookOutwardBooking(LocalDate startDate){
        System.out.println("Flight Onward Booking Date" + startDate);
    }
    public  void  bookReturnBooking(LocalDate endDate){
        System.out.println("Flight Return Booking Date" + endDate);
    }
}
