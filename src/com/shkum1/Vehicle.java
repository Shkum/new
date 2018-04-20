package com.shkum1;

public class Vehicle
{
   protected String price, position, speed, year;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Vehicle()
    {

    }

    public Vehicle(String price, String position, String speed, String year) {
        this.price = price;
        this.position = position;
        this.speed = speed;
        this.year = year;
    }
    public String info(){
        return ("\n" + getClass().toString().substring(getClass().toString().lastIndexOf(".")+1)+ "\nPrice - " + price +  "\nPosition - " + position +
                "\nSpeed - " + speed + "\nYear - " + year);
    }
}
