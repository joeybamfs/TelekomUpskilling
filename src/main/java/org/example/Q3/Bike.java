package org.example.Q3;

public class Bike extends Vehicle{

    public Bike(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void accelerate() {
        System.out.println("Kring kring!!");
    }

    public String toString(){
        return "Bike Make: " + this.make + ", Bike Model: " + this.model + ", Year of Manufacturer: " + this.year;
    }
}
