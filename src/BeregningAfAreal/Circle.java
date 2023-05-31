package BeregningAfAreal;

//2. Skriv to klasser, som implementerer interfacet.
public class Circle implements Shape{

    // Klassen Circle skal have følgende attribut (som skal sættes via klassens constructor):

    private  double radius;
    public Circle(double radius){

        this.radius= radius;
    }

//Klassen skal implementere metoden calculateArea(). Arealet af en cirkel er pi * radius2
// (hvilket kan skrives som Math.PI * (radius* radius)).
    @Override
    public double calcuateArea() {

       double areal= Math.PI*(radius*radius);

        return areal;
    }

}
