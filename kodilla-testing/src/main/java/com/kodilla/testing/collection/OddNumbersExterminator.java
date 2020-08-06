package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    public static List<Integer> numbers;
    public List<Integer> evenNumbers;

    public OddNumbersExterminator(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public Integer exterminate(List<Integer> numbers) {

        evenNumbers =null;
        int number = 0;
        for (number: numbers) {
            if(number %2 == 0) {
                evenNumbers.add(number);
            }
        }
    }
    public List<Integer> getEvenNumbers {
        return this.evenNumbers;
    }



}
