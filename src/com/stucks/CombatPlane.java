package com.stucks;

public class CombatPlane extends Airplane {

    public CombatPlane (){
        super("Uro_Fighter", "B.Aere_Space_Inc", "2,185 B$");
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
