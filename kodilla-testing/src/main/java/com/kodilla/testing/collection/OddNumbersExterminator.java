package com.kodilla.testing.collection;
import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> numbers;
    public ArrayList<Integer> evenNumbers;

    public OddNumbersExterminator(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {


        for (int number: numbers) {
            if(number %2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }


}
