package com.shkum1;

public class Plane extends Vehicle
{
String maxHeight, passangerQuantity;

    public Plane() {

    }

    public Plane(String price, String position, String speed, String year, String maxHeight, String passangerQuantity) {
        super(price, position, speed, year);
        this.maxHeight = maxHeight;
        this.passangerQuantity = passangerQuantity;
    }

    public String info()
    {
        return super.info()+ "\nMax Height - " + this.maxHeight + "\nPassanger quantity - " + this.passangerQuantity;
    }
}
