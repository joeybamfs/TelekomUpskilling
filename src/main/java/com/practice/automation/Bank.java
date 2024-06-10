package com.practice.automation;

public class Bank {

    public Bank(){
    }

    public String bankAccount(int bankBalance){
        //Question 1
        bankBalance = bankBalance + 250;
        bankBalance = bankBalance - 100;
        return "Bank Balance: $" + bankBalance;
    }

    public void degreeConversion(double Fahrenheit){
        double Celsius = Fahrenheit - (32 * 5 / 9);
        System.out.println("Fahrenheit: " + Fahrenheit);
        System.out.println("Conversion to Celsius: " + Celsius);
    }

    public void printNameDetails(String firstName, String lastName){
        String fullName = firstName + " " + lastName;
        int number1 = firstName.length();
        int number2 = lastName.length();
        System.out.println("Hello, my name is " + fullName + ". There are " + number1 + " letters in my first name and " + number2 + " letters in my last name.");
    }

    public void adultOrChild(int age){
        if (age >= 18 ){
            System.out.println("You are an adult");
        }
        else{
            System.out.println("You are a minor");
        }
    }

    public void switchCase(int age){
        switch (age){
            case 12:
                System.out.println("You are a child");
                break;
            case 19:
                System.out.println("You are a teenager");
                break;
            case 59:
                System.out.println("You are an adult");
                break;
            default:
                if(age >= 60){
                    System.out.println("You are a senior citizen");
                }else{
                    System.out.println("Invalid age");
                }
        };
    }

    public void loop(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }
    }

    public void nestedLoop(int numberOfSides){
        String triangle = "Triangle";
        String square = "Square";
        String pentagon = "Pentagon";


        if(numberOfSides == 3 || numberOfSides > 4 ){
            System.out.println("This shape is a polygon");
            if(numberOfSides == 3){
                System.out.println("To be more specific, this is a " + triangle);
            }
            else if(numberOfSides == 5){
                System.out.println("To be more specific, this is a " + pentagon);
            }
            else{
                System.out.println("This shape is another polygon of " + numberOfSides + " sides.");
            }
        }
        else if (numberOfSides == 4) {
            System.out.println("This shape is a quadrilateral, but specifically this quadrilateral is " + square);
        }
    }

    public void whileLoop(){
        int count = 10;
        while(count >= 1){
            System.out.println(count);
            count--;
        }
    }


    public static void main(String[] args) {
        //Question1
        Bank bankBal = new Bank();
        bankBal.bankAccount(500);
        Bank degrees = new Bank();
        degrees.degreeConversion(95.8);

        //Question2
        Bank printName = new Bank();
        printName.printNameDetails("Joey", "Bamfo");

        //Question 3
        //First question
        Bank age = new Bank();
        age.adultOrChild(16);
        age.adultOrChild(28);

        //Second question
        Bank switchAge = new Bank();
        switchAge.switchCase(12);

        //Third question
        Bank oneToTen = new Bank();
        oneToTen.loop();

        //Fourth question
        Bank sides = new Bank();
        sides.nestedLoop(3);

        //Fifth question
        Bank countDown = new Bank();
        countDown.whileLoop();
    }
}