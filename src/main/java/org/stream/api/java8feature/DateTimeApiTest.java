package org.stream.api.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;

// Local : Simplified date-time API with no complexity of timezone handling.
// Zoned : Specialized date-time API to deal with various timezones.
// LocalDate/LocalTime and LocalDateTime API : Use it when time zones are NOT required.
public class DateTimeApiTest {

    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println("LocalDate.now : "+ld);

        LocalDateTime ldt = LocalDateTime.of(2024,02,18,15,23);
        System.out.println("LocalDateTime.of : " + ldt);

        Month m = ld.getMonth();
        System.out.println("LocalDateGetMonth: " +m);
        LocalDateTime d = ld.atStartOfDay();
        System.out.println("LocalDateTimeStartOfaDay: "+d);
    }
}
