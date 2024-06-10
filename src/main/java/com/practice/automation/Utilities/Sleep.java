package com.practice.automation.Utilities;

public class Sleep {
    public static void sleep(int time){
        try{
            Thread.sleep(time);
        }catch(InterruptedException e){
            System.err.println("InterruptedException: " + e.getMessage());
        }
    }
}
