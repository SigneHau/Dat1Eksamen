package SammenlignByer;
//1. Skriv en klasse City med følgende attributter, der skal sættes via klassens constructor:
//• name
//• population
public class City {

    private String name;
    private int population;


    public City(String name, int population){
        this.name=name;
        this.population=population;
    }

//Skriv getter-metoder for attributterne.
    public String getName() {

        return name;
    }

    public int getPopulation() {

        return population;
    }



}
