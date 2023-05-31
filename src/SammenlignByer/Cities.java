package SammenlignByer;

//2. Skriv en klasse Cities, der indeholder en samling af byer.

import java.util.ArrayList;
import java.util.List;

public class Cities {

    private List<City> cities;

    public Cities(){

        cities= new ArrayList<>();
    }

 //Skriv en metode public void add(City city) som kan bruges til at tilføje en by til samlingen.
    // Skriv en metode public City getBiggestCity() som kan returnere den by, der har flest indbyggere.

    public void add(City city) {

        cities.add(city);
    }


    public City getBiggestCity() {
        City biggestCity = null;
        int maxPopulation = 0;
        for (City city : cities) {
            if (city.getPopulation() > maxPopulation) {
                biggestCity = city;
                maxPopulation = city.getPopulation();
            }

        }
        return biggestCity;
    }

    //Skriv en metode public int getTotalPopulation() i klassen Cities.
    // Metoden skal returnere det samlede indbyggertal af byerne i samlingen i Cities.

    public int getTotalPopulation(){
        int totalPopulation=0;
        for (City city : cities) {
            totalPopulation += city.getPopulation();

        }
        return totalPopulation;
    }

    //Skriv en metode public int getAveragePopulation() i klassen Cities.
   // Metoden skal returnere det gennemsnitlige indbyggertal af byerne i samlingen i Cities.
    public int  getAveragePopulation(){
        int averagePopulation = getTotalPopulation() / cities.size();

        return averagePopulation;
    }

}