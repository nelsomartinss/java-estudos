package Lessons.DateAndTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Instantiation {
    void main(){

        // Date
        LocalDate dateNow = LocalDate.now();
        System.out.println(dateNow);

        // Date and time
        LocalDateTime dateAndTimeNow =  LocalDateTime.now();
        System.out.println(dateAndTimeNow);

        // Instant
        Instant dateInstant = Instant.now();
        System.out.println(dateInstant); // London timezone (Z)

        // Text ISO 8601 -> date
        LocalDate localDateISO = LocalDate.parse("2001-03-19"); // ISO 8601 format
        System.out.println(localDateISO);

        // Text ISO 8601 -> date-time
        LocalDateTime localDateTimeISO = LocalDateTime.parse("2001-03-19T17:30:00"); // ISO 8601 format
        System.out.println(localDateTimeISO);

        // Text ISO 8601 -> Instant
        Instant instantISO =  Instant.parse("2001-03-19T17:30:00Z");
        System.out.println(instantISO);

        // GMT
        Instant instantGMT=  Instant.parse("2001-03-19T17:30:00-03:00");  // São Paulo
        System.out.println(instantGMT); // 3 hours ahead (London)

        // Custom format
        DateTimeFormatter DateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // default
        LocalDate customDate = LocalDate.parse("19/03/2001", DateFormatter); // ISO
        System.out.println(customDate);

        // Date and time
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime customDateTime = LocalDateTime.parse("19/03/2001 17:30", dateTimeFormatter);
        System.out.println(customDateTime);

        // Year, Month, Day
        LocalDate yearMonthDay = LocalDate.of(2001, 3, 19);
        System.out.println(yearMonthDay);

        // Year, Month, Day, Time
        LocalDateTime yearMonthDayTime = LocalDateTime.of(2001, 3, 19, 17, 30);
        System.out.println(yearMonthDayTime);
    }
}
