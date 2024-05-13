package org.example.Q1;

import java.lang.Math;
public class Rectangle extends Shape {
    double length;
    double breadth;

    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea(){
        return length * breadth;
    }

    @Override
    public double calculatePerimeter(){
        return (length + breadth) * 2;
    }
}
