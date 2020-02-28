package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalOperator;

public class StreamMain {
    public static void main(String[] args){
        Processor processor = new Processor();
        //ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10,5,(a,b) -> a + b);
        expressionExecutor.executeExpression(10,5,(a,b) -> a - b);
        expressionExecutor.executeExpression(10,5,(a,b) -> a * b);
        expressionExecutor.executeExpression(10,5,(a,b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(10,5, FunctionalOperator::addAToB);
        expressionExecutor.executeExpression(10,5, FunctionalOperator::subBFromA);
        expressionExecutor.executeExpression(10,5, FunctionalOperator::multiplyAByB);
        expressionExecutor.executeExpression(10,5, FunctionalOperator::divideAByB);
        System.out.println("\n" + "Zadanie 7.1: ");

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Słońce", text -> text + " świeci za dnia.");
        poemBeautifier.beautify("księżyc", text -> "A w nocy świeci " + text + ".");
        poemBeautifier.beautify("wielkie litery", text -> text.toUpperCase());
        poemBeautifier.beautify("MALE LITERY", text -> text.toLowerCase());

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}