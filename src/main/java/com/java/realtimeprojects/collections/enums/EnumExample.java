package com.java.realtimeprojects.collections.enums;

//Enum is a enumaration and its a special data type that is used to define named constants
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

enum TrafficLightColor {
    RED, GREEN, YELLOW
}


enum Direction {
    NORTH, SOUTH, EAST, WEST
}

enum HttpStatus {
    OK(200,"OK"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private int code;
    private String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

public class EnumExample {
    public static void main(String[] args) {

        System.out.println(Day.SUNDAY.ordinal());
        System.out.println(Day.MONDAY.ordinal());
        System.out.println(Day.TUESDAY.ordinal());
        System.out.println(Day.WEDNESDAY.ordinal());
        System.out.println(Day.THURSDAY.ordinal());
        System.out.println(Day.FRIDAY.ordinal());

        Day today = Day.SUNDAY;

        switch (today) {

            case MONDAY:
                System.out.println("Do Workout");
                break;
            case SUNDAY:
                System.out.println("Sleep");
                break;
            case FRIDAY:
                System.out.println("Go to Bar");
                break;
            case SATURDAY:
                System.out.println("Go to Movie");
                break;
            default:
                System.out.println(HttpStatus.INTERNAL_SERVER_ERROR.getCode() + " message" + HttpStatus.INTERNAL_SERVER_ERROR.getMessage());
        }
    }
}