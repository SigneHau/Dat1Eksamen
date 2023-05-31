package StenSaksPapir;

//Hvis du har tid: - sat den ind som en ny klasse og bare givet en main metode med herover så de kunne køre hver for sig..
//Giv mulighed for, at to (menneskelige) brugere spiller mod hinanden.

import java.util.Scanner;

public class StenSaksPapir {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Velkommen til Sten, Saks, Papir!");
        System.out.print("Navn for Spiller 1: ");
        String player1Name = scanner.nextLine();

        System.out.print("Navn for Spiller 2: ");
        String player2Name = scanner.nextLine();
        System.out.println(player1Name + " vs. " + player2Name);

        while (true) {

            System.out.print(player1Name + ", vælg dit træk (sten, saks, papir): ");
            String player1Move = scanner.nextLine();

            System.out.print(player2Name + ", vælg dit træk (sten, saks, papir): ");
            String player2Move = scanner.nextLine();

            if (!isValidMove(player1Move) || !isValidMove(player2Move)) {
                System.out.println("Ugyldigt træk. Prøv igen.");
                continue; // stopper den tur man er i gang med og starter forfra
            }

            String result = howWins(player1Move, player2Move);
            System.out.println("Resultat: " + result);

            System.out.print("Vil I spille igen? (ja/nej): ");
            String playAgain = scanner.nextLine().toLowerCase();

            if (!playAgain.equals("ja")) {
                System.out.println("Tak for spillet! Farvel!");
                break;   //stopper loopet
            }
        }

        scanner.close();
    }

    private static boolean isValidMove(String move) {
        return move.equals("sten") || move.equals("saks") || move.equals("papir");
    }

    private static String howWins(String move1, String move2) {
        if (move1.equals(move2)) {
            return "Uafgjort!";
        } else if ((move1.equals("sten") && move2.equals("saks")) ||
                (move1.equals("saks") && move2.equals("papir")) ||
                (move1.equals("papir") && move2.equals("sten"))) {
            return "Spiller 1 vinder!";
        } else {
            return "Spiller 2 vinder!";
        }
    }
}

