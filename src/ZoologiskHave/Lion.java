package ZoologiskHave;
//2. Skrive en klasse Lion som extender (nedarver fra) Animal.
// Implementer metoden makeSound() så metoden printer en “løvelyd” (fx “Rooooar”).
public class Lion extends Animal  {



    public Lion(){
        super(true);
    }
    @Override
    public void makeSound() {

        System.out.println("Lion says Rooooar");

    }
}
