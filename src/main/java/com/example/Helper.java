package com.example;

public class Helper {


    public boolean checkUserInput(String input) {
        String allowedStrings = "mrp";
        return input.matches("[" + allowedStrings + "]+");
    }
    public boolean checkIfOuOfBounds(int px, int py){
        return false;
    }
}
