package org.example.Q3;

public abstract class Vehicle {
    protected String make;
    protected String model;
    protected int year;

    public Vehicle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public abstract void accelerate();

    public void printVehicleDetails(){
        System.out.println("Vehicle Make: " + this.make);
        System.out.println("Vehicle Model: " + this.model);
        System.out.println("Year of Manufacture: " + this.year);
        this.accelerate();
    }

}
