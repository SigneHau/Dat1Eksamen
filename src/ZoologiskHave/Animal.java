package ZoologiskHave;
//1. Skriv en abstrakt klasse Animal med en abstrakt metode
// public void makeSound().
abstract class Animal {

    //Udvid klassen Animal med attributten isMammal. Lad attributten blive sat i klassens constructor.
    // Skriv constructors i de to underklasser Lion og Parrot, som kalder superklassens constructor
    public boolean isMammal; //pattedyr


    public Animal(boolean isMammal){

        this.isMammal=isMammal;
    }

    public boolean isMammal() {

        return isMammal;
    }

    public void makeSound(){

        System.out.println("Animal is making a sound");
    }

}
