package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String textToBeaut, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(textToBeaut);
        System.out.println(result);
    }
}
