package structuralPatterns.facadePattern;

import java.time.LocalDate;

public class VacationClient {
    public static void main(String[] args) {

        LocalDate startDate = LocalDate.of(2020, 1,11);
        LocalDate endDate = LocalDate.of(2020,1,20);
        VacationTrip vacationTrip = new VacationTrip();
        vacationTrip.bookVacationTrip(startDate,endDate);

    }
}
