package com.shkum1;

public class  Ship extends Vehicle
{
String portName, pasangerQuntity;

    public Ship() {
    }

    public Ship(String price, String position, String speed, String year, String portName, String pasangerQuntity) {
        super(price, position, speed, year);
        this.portName = portName;
        this.pasangerQuntity = pasangerQuntity;
    }

    public String info() {
        return (super.info() + "\nPort Name - " + this.portName + "\nPassanger quantity - " + this.pasangerQuntity);
    }
}
