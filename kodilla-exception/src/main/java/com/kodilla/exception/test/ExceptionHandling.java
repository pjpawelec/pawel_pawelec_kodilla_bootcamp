package com.kodilla.exception.test;

import java.io.IOException;

public class ExceptionHandling extends Exception {

    public static void main(String args[]) {
        try {
            SecondChallenge secondChallenge = new SecondChallenge();
            System.out.println(secondChallenge.probablyIWillThrowException(1.1,1.5));
        } catch (ExceptionHandling e) {
            System.out.println("Impossible to execute.");
        }
    }
}