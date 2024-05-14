package org.example.Q5;
import org.w3c.dom.ls.LSOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Area {
    private double length;
    private double breadth;

    public Area(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double returnArea(){
        return this.length * this.breadth;
    }

    public static void main (String[] args){
        System.out.print("Enter length: ");
        var scanner = new Scanner(System.in);
        double length = 0;
        try {
             length = scanner.nextDouble();
        }catch (InputMismatchException e){
            System.err.println("InputMismatchException: " + e.getMessage());
        }
        System.out.print("Enter breadth: ");
        double breadth = 0;
        try{
            breadth = scanner.nextDouble();
        }catch (InputMismatchException e){
            System.err.println("InputMismatchException: " + e.getMessage());
        }

        Area areaRectangle = new Area(length,breadth);

        System.out.println("Area: " + areaRectangle.returnArea());

    }
}
