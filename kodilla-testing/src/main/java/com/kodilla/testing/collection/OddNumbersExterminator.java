package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public int exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        for (Integer number : numbers){
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        System.out.println("Size of even numbers list: " + evenNumbers.size());
        return evenNumbers.size();
    }
    public static void main(String[] args){

        ArrayList<Integer> evenAndOddNumbers = new ArrayList<Integer>();
        evenAndOddNumbers.add(3);
        evenAndOddNumbers.add(1);
        evenAndOddNumbers.add(2);
        evenAndOddNumbers.add(8);

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        oddNumbersExterminator.exterminate(evenAndOddNumbers);
    }
}

