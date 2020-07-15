package com.stucks;

public abstract class Airplane {
    protected String name, brend, price;

    public abstract String getPrice();
    public abstract String getBrend();
    public abstract String getName();

    public Airplane (String name, String brend, String price){
        this.name = name;
        this.brend = brend;
        this.price = price;
    }
}
