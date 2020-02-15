package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result =  simpleUser.getUsername();

        if(result.equals("theForumUser")) {
            System.out.println("test OK");
        }else{
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        int additionResult = calculator.add(3,2);
        if(additionResult == 5) {
            System.out.println("test dodawania OK");
        }else{
            System.out.println("dodawanie error!");
        }

        int subtractionResult = calculator.subtract(3,2);
        if(subtractionResult == 1) {
            System.out.println("test odejmowania OK");
        }else{
            System.out.println("odejmowanie error!");
        }
    }
}
