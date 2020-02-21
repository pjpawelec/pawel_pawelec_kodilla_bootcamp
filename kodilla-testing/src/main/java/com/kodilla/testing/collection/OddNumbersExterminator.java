package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : numbers){
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        System.out.println("Size of even numbers list: " + evenNumbers.size());
        int result = evenNumbers.size();
        return evenNumbers;

    }
    public static void main(String[] args){

        List<Integer> evenAndOddNumbers = new ArrayList<>();
        evenAndOddNumbers.add(3);
        evenAndOddNumbers.add(1);
        evenAndOddNumbers.add(2);
        evenAndOddNumbers.add(8);

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        oddNumbersExterminator.exterminate(evenAndOddNumbers);
    }

   }

