package structuralPatterns.facadePattern;

import java.time.LocalDate;

public class VacationTrip {
    public void bookVacationTrip(LocalDate startDate,LocalDate endDate){
        FlightBooking flightBooking = new FlightBooking();
        flightBooking.bookOutwardBooking(startDate);
        flightBooking.bookReturnBooking(endDate);

        HotelBooking hotelBooking = new HotelBooking();
        hotelBooking.bookHotelBooking(startDate, endDate);

        CarRentalBooking carRentalBooking = new CarRentalBooking();
        carRentalBooking.bookCarRentalBooking(startDate, endDate);
    }
}
