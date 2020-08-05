package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        // kolejny test ->
        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator testCalculator = new Calculator();

        int resultAdd = testCalculator.addAToB(10, 5);
        if(resultAdd ==15) {
            System.out.println("Add test OK");
        } else {
            System.out.println("Add test error!");
        }

        int resultSubtract = testCalculator.subtractAFromB(10, 5);
        if(resultSubtract == 5) {
            System.out.println("Subtract test OK");
        } else {
            System.out.println("Subtract test error!");
        }
        }


    }