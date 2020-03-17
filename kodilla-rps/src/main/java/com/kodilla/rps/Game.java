package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public void startGame() {

        Random generator = new Random();
        int roundsNumber = UserDialogs.getNumbersOfRounds();
        int playerPoints = 0;
        int computerPoints = 0;

        while (playerPoints < roundsNumber && computerPoints < roundsNumber) {

            int playerChoice = UserDialogs.getUserMove();
            int computerChoice = generator.nextInt(3) + 1;

            if (playerChoice != 1 && playerChoice != 2 && playerChoice != 3) {
                System.out.println("Błędny wybór. Spróbuj jeszcze raz.");
            }
            if (playerChoice == 1 && computerChoice == 1) {
                playerPoints = playerPoints + 0;
                computerPoints = computerPoints + 0;
                System.out.println("Twój wybór - KAMIEN (punkty: " + playerPoints + ") \nWybór komputera - KAMIEN (punkty: " + computerPoints + ")");
            }
            if (playerChoice == 1 && computerChoice == 2) {
                playerPoints = playerPoints + 0;
                computerPoints = computerPoints + 1;
                System.out.println("Twój wybór - KAMIEN (punkty: " + playerPoints + ") \nWybór komputera - PAPIER (punkty: " + computerPoints + ")");
            }
            if (playerChoice == 1 && computerChoice == 3) {
                playerPoints = playerPoints + 1;
                computerPoints = computerPoints + 0;
                System.out.println("Twój wybór - KAMIEN (punkty: " + playerPoints + ") \nWybór komputera - NOZYCE (punkty: " + computerPoints + ")");
            }
            if (playerChoice == 2 && computerChoice == 1) {
                playerPoints = playerPoints + 1;
                computerPoints = computerPoints + 0;
                System.out.println("Twój wybór - PAPIER (punkty: " + playerPoints + ") \nWybór komputera - KAMIEN (punkty: " + computerPoints + ")");
            }
            if (playerChoice == 2 && computerChoice == 2) {
                playerPoints = playerPoints + 0;
                computerPoints = computerPoints + 0;
                System.out.println("Twój wybór - PAPIER (punkty: " + playerPoints + ") \nWybór komputera - PAPIER (punkty: " + computerPoints + ")");
            }
            if (playerChoice == 2 && computerChoice == 3) {
                playerPoints = playerPoints + 0;
                computerPoints = computerPoints + 1;
                System.out.println("Twój wybór - PAPIER (punkty: " + playerPoints + ") \nWybór komputera - NOZYCE (punkty: " + computerPoints + ")");
            }
            if (playerChoice == 3 && computerChoice == 1) {
                playerPoints = playerPoints + 0;
                computerPoints = computerPoints + 1;
                System.out.println("Twój wybór - NOZYCE (punkty: " + playerPoints + ") \nWybór komputera - KAMIEN (punkty: " + computerPoints + ")");
            }
            if (playerChoice == 3 && computerChoice == 2) {
                playerPoints = playerPoints + 1;
                computerPoints = computerPoints + 0;
                System.out.println("Twój wybór - NOZYCE (punkty: " + playerPoints + ") \nWybór komputera - PAPIER (punkty: " + computerPoints + ")");
            }
            if (playerChoice == 3 && computerChoice == 3) {
                playerPoints = playerPoints + 0;
                computerPoints = computerPoints + 0;
                System.out.println("Twój wybór - NOZYCE (punkty: " + playerPoints + ") \nWybór komputera - NOZYCE (punkty: " + computerPoints + ")");
            }
        }
        if (playerPoints > computerPoints) {
            System.out.println("KONIEC ROZGRYWKI, WYGRALES!");
        } else {
            System.out.println("KONIEC ROZGRYWKI, PRZEGRALES!");
        }

        UserDialogs nextStep = new UserDialogs();
        nextStep.whatIsNextStep();
    }
}