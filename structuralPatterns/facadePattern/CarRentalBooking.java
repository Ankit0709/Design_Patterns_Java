package structuralPatterns.facadePattern;

import java.time.LocalDate;

public class CarRentalBooking {
    public void bookCarRentalBooking(LocalDate startDate,LocalDate endDate){
        System.out.println("Car Rental Booking starts from "+startDate+" to "+endDate);
    }
}
