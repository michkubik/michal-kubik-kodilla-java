package com.kodilla.testing.collection;
import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> oddNumbers = new ArrayList<>();
    public ArrayList<Integer> evenNumbers = new ArrayList<>();

    public ArrayList<Integer> getOddNumbers() {
        return oddNumbers;
    }

    public ArrayList<Integer> getEvenNumbers() {
        return evenNumbers;
    }

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {


        for (int number: numbers) {
            if(number %2 == 0) {
                evenNumbers.add(number);
            }
            else {
                oddNumbers.add(number);
            }
        }
        return evenNumbers;

    }


}
