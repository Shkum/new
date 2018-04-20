package com.shkum1;

public class Main {

    public static void main(String[] args) {
        // write your code here
       // Plane plane = new Plane("20", "x,y", "1018", "2018", "10000", "50");

       // System.out.println(plane.info());
        Vehicle garage[] = new Vehicle[5];
        garage[0] = new Plane("1", "2", "3", "4", "5", "6");
        garage[1] = new Car("1", "2", "3", "4", "5", "6");
        garage[2] = new Plane("1", "2", "3", "4", "5", "6");
        garage[3] = new Ship("1", "2", "3", "4", "5", "6");
        garage[4] = new Car("1", "2", "3", "4", "5", "6");
        for (Vehicle a : garage) {
            System.out.println(a.info());
        }
    }
}
