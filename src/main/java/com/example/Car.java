package com.example;

public class Car extends Vehicle {
    private String modelName = "Mustang";
    public Car() { this.brand = "Ford"; } // Accessing protected field
    public String getModel() { return modelName; }
}
