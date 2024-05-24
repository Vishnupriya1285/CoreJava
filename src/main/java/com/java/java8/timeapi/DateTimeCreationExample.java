package com.java.java8.timeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTimeCreationExample {
    public static void main(String[] args) {
        LocalDate currentDate=LocalDate.now();
        System.out.println(currentDate);
        LocalTime currentTime=LocalTime.now();
        System.out.println(currentTime);
        LocalDateTime currentDateTime=LocalDateTime.now();
        System.out.println(currentDateTime);

        LocalDateTime ausSydneyDateTime=LocalDateTime.now(ZoneId.of( "Australia/Sydney"));
        System.out.println(ausSydneyDateTime);

        LocalDateTime americaAtlantaDateTime=LocalDateTime.now(ZoneId.of( "-05:00"));
        System.out.println(americaAtlantaDateTime);

        LocalDate futureDate=LocalDate.of(2024,12,31);
        System.out.println(futureDate);

        LocalDateTime futureDateTime=LocalDateTime.of(2024,12,31,12,00,00);
        System.out.println(futureDateTime);

    }
}
