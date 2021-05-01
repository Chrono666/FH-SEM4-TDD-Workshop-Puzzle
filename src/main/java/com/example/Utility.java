package com.example;

public class Utility {


    public boolean checkUserInput(String input) {
        String allowedStrings = "mrp";
        return input.matches("[" + allowedStrings + "]+");
    }
    public boolean checkIfOuOfBounds(){
        return false;
    }
}
