package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalBeautifier;
import com.kodilla.stream.reference.FunctionalCalculator;

import static java.lang.Character.toUpperCase;


public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Litwo ojczyzno ty moja", (poem -> "AAA " + poem + " BBB"));
        poemBeautifier.beautify("Cóż to za chłopak piękny i młody", (poem -> poem.toUpperCase()));
        poemBeautifier.beautify("LA LA LALALA", (poem -> poem.toLowerCase()));
        poemBeautifier.beautify("Mimozami jesień się zaczyna ", (poem -> poem.repeat(2)));
        poemBeautifier.beautify("Mimozami jesień się zaczyna", (poem -> poem.replace("jesień", "wiosna")));

        System.out.println("Printing expressions with method references");
        poemBeautifier.beautify("To jest nowy wiersz", FunctionalBeautifier::addABC);
        poemBeautifier.beautify("Nana nana na na na", FunctionalBeautifier::upperCasePoem);
    }
}