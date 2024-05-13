package org.example.Q2;

public enum Color {
    RED("#FF0000"), GREEN("#008000"), BLUE("#0000FF"), YELLOW("#FFFF00"), BLACK("#000000");

    public String colorCode;

    Color(String colorCode){
        this.colorCode = colorCode;
    }

    public String getColorCode(){
        return colorCode;
    }

    public static void printColorCode(){
        for(Color color : Color.values()){
            System.out.println(color + ": " + color.getColorCode());
        }
    }




}
