package org.example.Q3;

public class Car extends Vehicle{

    public Car(String make, String model, int year){
        super(make, model, year);
    }

    @Override
    public void accelerate() {
        System.out.println("Vroom vroom");
    }

    public String toString(){
        return "Car Make: " + this.make + ", Car Model: " + this.model + ", Year of Manufacturer: " + this.year;
    }
}
