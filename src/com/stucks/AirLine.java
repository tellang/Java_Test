package com.stucks;

public class AirLine extends Airplane {

    public AirLine (){
        super("A380", "Air_Bus_Inc", "4,100 B$");
    }

    @Override
    public String getBrend() {
        return this.brend;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getPrice() {
        return this.price;
    }
}