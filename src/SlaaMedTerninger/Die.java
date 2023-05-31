package SlaaMedTerninger;
import java.util.Random;
//1. Skriv en klasse Die, som repræsenterer en terning. Klassen skal have attributten
//• sides

public class Die {

    int sides;

    //Attributten skal sættes via klassens constructor
    public Die(int sides){

        this.sides=sides;
    }

    //2. Klassen Die skal have metoden public int roll() som returnerer et tilfældigt tal mellem 1
    //og antal sider på terningen (begge inklusive). Du kan fx bruge metoden nextInt()fra klassen
    //Random til at få genereret et tilfældigt tal
    public int roll(){
        Random random = new Random();
        int eyes = random.nextInt(sides)+1;

        return eyes;
//eller return random.nextInt(sides) + 1;

    }
}
