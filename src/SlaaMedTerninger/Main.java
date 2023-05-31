package SlaaMedTerninger;
// 5. Skriv en klasse Main med en main-metode, hvor du tester, at din kode virker.
public class Main {
    public static void main(String[] args) {



        Die die = new Die(6);
        int result = die.roll();
        System.out.println(result);



        Cup cup1 = new Cup(6); // opretter en Cup med to terninger med 6 sider
        int match = cup1.howManyIdenticalThrows(100);
        System.out.println("Antal identiske kast; "+ match);


        int[] results = new int[5];
        results = cup1.results(5);

        for (int sumOfDies:results) {
            System.out.println(sumOfDies);
        }

    }
}
