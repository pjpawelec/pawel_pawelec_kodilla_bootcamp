package com.kodilla.rps;

import java.util.Scanner;

public class UserDialogs {

    public static String getUserName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jak masz na imię?");
        String playerName = sc.nextLine();
        return playerName;
    }

    public static int getNumbersOfRounds() {
        Scanner sc = new Scanner(System.in);
        String playerName = getUserName();
        System.out.println("Cześć " + playerName + "! " + "Do ilu wygranych chcesz zagrać?");
        int roundsNumber = sc.nextInt();
        return roundsNumber;
    }

    public static int getUserMove() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Wybierz swój ruch:\n1 - kamień\n2 - papier\n3 - nożyce");
            String s = sc.nextLine().toUpperCase().trim();
            if (s.equals("1")) return 1;
            else if (s.equals("2")) return 2;
            else if (s.equals("3")) return 3;
            else System.out.println("Błędny wybór. Spróbuj jeszcze raz.");
        }
    }

    public void whatIsNextStep() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nChcesz zagrać jeszcze raz?\nx - koniec\nn - nowa rozgrywka");
        String nextStep = scanner.nextLine();

        if (nextStep.equals("x")) {
            System.out.println("KONIEC GRY");
        } else if (nextStep.equals("n")) {
            Game game = new Game();
            game.startGame();
        } else {
            System.out.println("Błędny wybór. Spróbuj jeszcze raz.");
            whatIsNextStep();
        }
    }
}



