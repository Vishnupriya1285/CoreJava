package com.java.java8.timeapi;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class CompareTwoDates {
    public static void main(String[] args) {
        LocalDateTime futureDateTime=LocalDateTime.of(2024,12,31,23,59,59);
        LocalDateTime currentDateTime=LocalDateTime.now();

        Duration duration=Duration.between(currentDateTime,futureDateTime);
        System.out.println("Days : "+duration.toDays()+" Hours : "+duration.toHours());

        Period period=Period.between(currentDateTime.toLocalDate(),futureDateTime.toLocalDate());
        System.out.println("Months : "+period.getMonths()+" Days : "+period.getDays()+" Months : "+period.toTotalMonths());

    }
}
