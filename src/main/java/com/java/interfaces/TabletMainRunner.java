package com.java.interfaces;

public class TabletMainRunner {
    public static void main(String[] args) {
        Tablet tablet=new Tablet(new HomeWiFiRouter());
        tablet.turnOn();
        tablet.connect();
        tablet.configure();
        tablet.playingGames();
        tablet.reset();
        tablet.disconnect();
        tablet.turnOff();
    }
}
