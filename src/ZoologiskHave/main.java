package ZoologiskHave;

import java.util.ArrayList;

//Skriv en klasse Main med en main-metode. I main-metoden skal du lave en ArrayList<Animal>
// og tilføje et Lion-objekt og et Parrot-objekt til listen.

public class main {
    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Lion());
        animals.add(new Parrot());

        for (Animal animal : animals) {
            animal.makeSound();
        }

        //Skriv en metode i klassen Main, der kan tage en liste af Animal-objekter og returnere en ny liste,
        // som kun indeholder de Animal-objekter, som er pattedyr (mammals).
        ArrayList<Animal> mammals = getMammals(animals);  //Metoden er nedenunder og tjekker om det er et pattedyr.
        System.out.println("Mammals:");
        for (Animal animal : mammals) {
            System.out.println(animal.getClass().getSimpleName()); //indbygget funktion som giver navnet på klassen
        }

        //Skriv en metode i klassen Main, der kan tage en liste af Animal-objekter og returnere en ny liste,
        // som kun indeholder de Animal-objekter, som er objekter af klassen Lion.
        ArrayList<Lion> lions = getLions(animals);
        System.out.println("Lions:");
        for (Lion lion : lions) {
            System.out.println(lion.getClass().getSimpleName()); //indbygget funktion som giver navnet på klassen
        }
    }

    public static ArrayList<Animal> getMammals(ArrayList<Animal> animals) {
        ArrayList<Animal> mammals = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal.isMammal()) { // tjekker om der er nogen der er true i isMammal()
                mammals.add(animal);
            }
        }
        return mammals;
    }

    public static ArrayList<Lion> getLions(ArrayList<Animal> animals) {
        ArrayList<Lion> lions = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Lion) {  //kigger listen igennem om der findes et objektet af typen Lion
                lions.add((Lion) animal);
            }
        }
        return lions;
    }
}
