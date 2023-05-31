package StenSaksPapir;

import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Velkommen til Sten - Saks - Papir ");

//1. Programmet skal bede brugeren om deres navn.
        System.out.println("Hvad er dit navn? ");
        String name = scanner.nextLine();

//2. Programmet skal derefter bede brugeren om at vælge deres træk ved at indtaste enten "sten," "saks," eller "papir."
        String playAgain = "ja";
        while (playAgain.equals("ja")) {

            System.out.println("Velkommen " + name + "  - hvilket træk vælger du?");

            String input = scanner.nextLine();

            System.out.println("Du har valgt " + input);


            //3. Programmet skal derefter tilfældigt vælge et træk for computeren
            // (hint: du kan bruge klassen Random fra Javas API til at genere et tilfældigt tal).
            String computerMove = generateComputerMove(random);
            System.out.println("Computerens træk: " + computerMove);

            String result = hvemVinder(input, computerMove);
            System.out.println("Resultat: " + result);

            //Programmet skal derefter spørge brugeren, om de vil spille igen. Hvis brugeren indtaster "ja," skal spillet starte forfra ved trin 2.
            // Hvis brugeren indtaster "nej," skal programmet slutte.

            System.out.print("Vil du spille igen? (ja/nej): ");
            playAgain = scanner.nextLine();

        }
        System.out.println("Tak for spillet! Farvel!");

        scanner.close();
    }


    private static boolean isValidMove(String move) {
        return move.equals("sten") || move.equals("saks") || move.equals("papir");

    }

    private static String generateComputerMove(Random random) {
        int randomNumber = random.nextInt(3);

        if (randomNumber == 0) {
            return "sten";
        } else if (randomNumber == 1) {
            return "saks";

        } else {
            return "papir";
        }
    }

    //Programmet skal derefter afgøre vinderen af runden baseret på følgende regler:
//a. sten slår saks
//b. saks slår papir
//c. papir slår sten
//5. Programmet skal derefter udskrive resultatet af runden, inklusive brugerens træk, computerens træk, og vinderen.
    private static String hvemVinder(String input, String computerMove) {
        if (input.equals(computerMove)) {
            return "Uafgjort!";

        } else if ((input.equals("sten") && computerMove.equals("saks")) ||
                (input.equals("saks") && computerMove.equals("papir")) ||
                (input.equals("papir") && computerMove.equals("sten"))) {
            return "Du vinder!";
        } else {
            return "Computeren vinder!";
        }
    }

}





