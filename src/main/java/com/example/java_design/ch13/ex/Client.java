package com.example.java_design.ch13.ex;

public class Client {
    public static void main(String[] args) {
        NaviFactory factory = new BasicNaviFactory();

        GPS gps = factory.createGPS();
        Screen mapScreen = factory.createScreen();
        PathFinder pathFinder = factory.createPathFinder();

        Map map = factory.createMap();
        mapScreen.drawMap(map);

        Location l1 = gps.findCurrentLocation();
        Location l2 = gps.findCurrentLocation();

        pathFinder.findPath(l1, l2);
    }
}
