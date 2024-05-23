package org.example.Utilies;

public class Sleep {
    public static void sleep(){
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            System.err.println("InterruptedException: " + e.getMessage());
        }
    }
}
