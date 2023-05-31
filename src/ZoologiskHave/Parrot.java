package ZoologiskHave;
//3. Skriv en klasse Parrot som extender (nedarver fra) Animal.
// Implementer metoden makeSound() så metoden printer en “papegøjelyd” (fx “Hello, world”).
public class Parrot extends Animal {


    public Parrot(){

        super(false);
    }

    @Override
    public void makeSound() {

        System.out.println("Hallo world");
    }
}
