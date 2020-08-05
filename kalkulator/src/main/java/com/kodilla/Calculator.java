package com.kodilla;

public class Calculator {

    int firstNumber;
    int secondNumber;

    public Calculator() {
        this.firstNumber = firstNumber;
        this. secondNumber = secondNumber;
    }

    public int addAtoB(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
    public int subtractAfromB(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int result = calculator.addAtoB(5, 5);

        System.out.println("And the result is: " + result);

    }

}

