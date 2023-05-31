package SammenlignByer;

public class Main {

//3. Skriv en klasse Main med en main-metode.
//I main-metoden skal du oprette et objekt af klassen Cities.
    public static void main(String[] args){

       // I main-metoden skal du oprette et objekt af klassen Cities.

        Cities cities = new Cities();

        //Tilføj dernæst fem City-objekter til Cities-objektet ved at bruge addCity(City city)- metoden.
        // Dine fem objekter skal have følgende attributter:

        cities.add(new City("Kongens Lyngby", 57500));
        cities.add(new City("Ribe", 8257));
        cities.add(new City(" ”Storvorde,”, ", 3425));
        cities.add(new City("Tarm”", 4010));
        cities.add(new City("Horreby", 3050));

        //Kald metoden getBiggestCity() på Cities-objektet og print navnet ud på den by, der returnere
       City biggesteCity = cities.getBiggestCity();
       System.out.println("The biggeste city is:" + biggesteCity.getName());



        int totalPopulation= cities.getTotalPopulation();
        System.out.println(totalPopulation);

        int averagePopulation = cities.getAveragePopulation();
        System.out.println(averagePopulation);



    }
}
