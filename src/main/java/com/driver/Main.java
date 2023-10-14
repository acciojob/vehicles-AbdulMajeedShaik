package com.driver;


public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("Mercedes F1", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);

        Boat boat = new Boat("SpeedBoat", 6);
        System.out.println("Boat Name: " + boat.getVehicleName());
        System.out.println("Boat Capacity: " + boat.getVehicleCapacity());
    }
}