package org.example.Q3;

public class Main {
    public static void main (String[] args){
        Bike bikeDetails = new Bike("Ducati","Panigale",2024);
        Car carDetails = new Car("Mercedes Benz", "AMG GLE 300", 2023);

        bikeDetails.printVehicleDetails();
        System.out.println("***************************************************************************");
        carDetails.printVehicleDetails();
    }
}
