package org.example;
import org.w3c.dom.ls.LSOutput;

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
        double length = scanner.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = scanner.nextDouble();

        Area areaRectangle = new Area(length,breadth);

        System.out.println("Area: " + areaRectangle.returnArea());

    }
}
