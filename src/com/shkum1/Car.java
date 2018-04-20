package com.shkum1;

public class Car extends Vehicle {
    String carModel, carID;

    public Car() {
    }

    public Car(String price, String position, String speed, String year, String carModel, String carID) {
        super(price, position, speed, year);
        this.carModel = carModel;
        this.carID = carID;
    }

    public String info() {
        return (super.info() + "\nCar Model - " + this.carModel + "\nCar Number - " + this.carID);
    }
}

