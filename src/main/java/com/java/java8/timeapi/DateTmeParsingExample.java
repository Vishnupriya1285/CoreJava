package com.java.java8.timeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTmeParsingExample {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MM/DD/YYYY");
        System.out.println(formatter.format(LocalDate.now()));

        DateTimeFormatter formatter1=DateTimeFormatter.ofPattern("DD/MM/YYYY HH:MM:SS");
        System.out.println(formatter1.format(LocalDateTime.now()));
    }
}
