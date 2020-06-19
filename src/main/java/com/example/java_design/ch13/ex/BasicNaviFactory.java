package com.example.java_design.ch13.ex;

public class BasicNaviFactory extends NaviFactory {
    @Override
    public GPS createGPS() {
        return new CheapGPS();
    }

    @Override
    public Screen createScreen() {
        return new SDScreen();
    }

    @Override
    public PathFinder createPathFinder() {
        return new SlowPathFinder();
    }

    @Override
    public Map createMap() {
        return new SmallMap();
    }
}
