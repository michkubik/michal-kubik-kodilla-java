package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main (String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try{
            secondChallenge.probablyIWillThrowException(5.0, 2.0);
        }

        catch (Exception e) {
            System.out.println("Przechwycono wyjątek!");
        }

        finally {
System.out.println("Koniec programu!");
        }
    }
}
