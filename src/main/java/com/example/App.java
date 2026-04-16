package com.example;

public class App {
    public static void main(String[] args) {
        // Demonstrating Polymorphism through Inheritance
        Vehicle myVehicle = new Car();
        System.out.println("This car runs on: " + myVehicle.fuelType());
    }
}
