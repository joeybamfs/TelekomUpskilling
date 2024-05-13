package org.example.Q1;

public class Main {
    public static void main (String[] args){
        Circle radiusOfCircle = new Circle(8);
        Rectangle sidesOfRectangle = new Rectangle(2.5,3.6);

        System.out.println(radiusOfCircle.calculateArea());
        System.out.println(radiusOfCircle.calculatePerimeter());
        System.out.println(sidesOfRectangle.calculateArea());
        System.out.println(sidesOfRectangle.calculatePerimeter());

    }
}
