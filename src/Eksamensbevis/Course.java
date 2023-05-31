package Eksamensbevis;

//Skriv en klasse Course med attributterne
public class Course {

    private String courseName;
    private double grade;

    public Course (String courseName, double grade){
    this.courseName= courseName;
    this.grade= grade;
    }

//Attributterne skal sættes via klassens constructor.
// Lav en public String toString()-metode til klassen, som returnerer en String,
// der indeholder courseName og grade for eksempel i formatet “kursusnavn: karakter”.
    @Override
    public String toString() {
        return  "Kursusnavn:'" + courseName + '\'' +
                ", Karakter:" + grade;
    }
}
