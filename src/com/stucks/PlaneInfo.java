package com.stucks;

public class PlaneInfo {
    /*public String name, brend, price;

    public PlaneInfo (Airplane airplane){
        this.name = airplane.name;
        this.brend = airplane.brend;
        this.price = airplane.price;
    }*/

    public static void showPlaneInfo(Airplane airplane){
        System.out.println("Name : "+airplane.getName());
        System.out.println("Brend : "+airplane.getBrend());
        System.out.println("Price : "+airplane.getPrice());
    }
}
