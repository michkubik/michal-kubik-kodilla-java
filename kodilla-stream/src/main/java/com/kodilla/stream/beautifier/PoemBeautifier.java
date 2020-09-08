package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String poem, PoemDecorator poemDecorator) {
        String newPoem = poemDecorator.decorate(poem);
        System.out.println("Decorated poem: " + newPoem);
    }
}
