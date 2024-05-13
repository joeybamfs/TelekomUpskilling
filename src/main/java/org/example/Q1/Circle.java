package org.example.Q1;
import java.lang.Math;

public class Circle extends Shape {
    double radius;
    double pi = Math.PI;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return pi * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter(){
        return pi * 2 * radius;
    }
}
