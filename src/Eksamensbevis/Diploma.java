package Eksamensbevis;

import java.util.ArrayList;
import java.util.List;

//Skriv en klasse Diploma med attributterne studentName og courses.
//hvor courses er en samling af Course-objekter.
public class Diploma {
    private String studentName;
    private List<Course> courses;

//Attributten studentName skal sættes via klassens constructor.
    public Diploma(String studentName){
        this.studentName=studentName;
        this.courses = new ArrayList<>();
    }

    //3. Skriv metoden public void addCourse(Course course) i klassen Diploma.
    // Metoden skal bruges til at tilføje nye Course-objekter til samlingen courses.
    public void addCourse(Course course) {

        courses.add(course);
    }
//Skriv metoden public String toString()i klassen Diploma.
// Metoden skal returnere en String med studentName efterfulgt af courseName
// og grade fra hvert enkelt Course i samlingen courses.
    @Override
    public String toString() {
        String diploma = "Diploma:" + studentName + "\n";
        for (Course c: courses) {
            diploma = diploma + c.toString() + "\n";   // toString bliver kald fra Course så kursusnavn og karakter også kommer med
        }
        return diploma;
    }
}

