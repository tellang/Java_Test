package com.stucks;

public class Main {

    public static void main(String[] args) {
        CombatPlane cp = new CombatPlane();
        AirLine al = new AirLine();

        PlaneInfo.showPlaneInfo(cp);
        PlaneInfo.showPlaneInfo(al);
    }
}
