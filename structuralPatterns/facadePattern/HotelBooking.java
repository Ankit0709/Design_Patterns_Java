package structuralPatterns.facadePattern;

import java.time.LocalDate;

public class HotelBooking {
    public void bookHotelBooking(LocalDate startDate, LocalDate endDate){
        System.out.println("Hotel Booking starts from "+startDate+" to "+endDate);
    }
}
