package SlaaMedTerninger;
import java.util.Random;
public class Cup {

//3. Skriv en klasse Cup, som kan kaste med terninger. Klassen skal have én eller to attributter, der
//holder to Die-objekter. Attributterne skal sættes via klassens constructor.

    private Die die1;
    private Die die2;

    private Random random;

    public Cup(int sides) {
        die1 = new Die(sides);
        die2 = new Die(sides);
    }


//4. Klassen Cup skal have metoden public int howManyIdenticalThrows(int times)
//som slår med terningerne et antal gange (times) og returnerer hvor mange gange der er slået to ens
//(fx to 1’er, to 2’ere osv).

    public int howManyIdenticalThrows(int times) {
        int count = 0;
        for (int i = 0; i < times; i++) {
            int result1 = die1.roll();
            int result2 = die2.roll();
            if (result1 == result2) {
                count++;
            }

        }
        return count;
    }
    //Lav en metode public int[] results(int times) i klassen Cup. Metoden skal slå med
    //terningerne et antal gange (times) og returnere et array som indeholder resultatet af hvert slag
    //(det vil sige summen af de to terninger).

    public int[] results(int times) {

        int[] results = new int[times];

        for (int i = 0; i < times; i++) {
            int result1 = die1.roll();    // første terning
            int result2 = die2.roll();  // Slå anden terning

            int sum = result1 + result2; // Beregn summen af de to terninger
            results[i] = sum;
        }
        return results;
    }
}
