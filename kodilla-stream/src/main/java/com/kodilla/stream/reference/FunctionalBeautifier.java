package com.kodilla.stream.reference;

public class FunctionalBeautifier {
    public static String addABC(String poem) {
        String betterPoem = "ABC " + poem + " ABC";
        return betterPoem;
    }

    public static String upperCasePoem(String poem) {
        String betterPoem = poem.toUpperCase();
        return betterPoem;
    }
}
