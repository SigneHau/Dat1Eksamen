package Eksamensbevis;

//Skriv en klasse Main med en main-metode. Opret objekt af klassen Diploma.
// Tilføj et antal Course-objekter til Diploma-objektets samling.
// Udskriv Diploma-objektet ved at anvende toString()-metoden.

public class Main {
    public static void main(String[] args) {
        Diploma diploma = new Diploma("Signe");


        diploma.addCourse(new Course("Dat 1",2.0));
        diploma.addCourse(new Course("Dat 2",4.0));
        diploma.addCourse(new Course("Dat 3",7.0));
        diploma.addCourse(new Course("Dat 4",10.0));
        diploma.addCourse(new Course("Dat 5",12.0));


      System.out.println(diploma.toString());

    }
}
