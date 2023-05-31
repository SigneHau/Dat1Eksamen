package BeregningAfAreal;

//2. Skriv to klasser, som implementerer interfacet.
public class Square implements Shape {

//Klassen Square skal have følgende attributter (som skal sættes via klassens constructor) :
    private  double height;
    private  double length;

    public Square (double height, double length){
        this.height= height;
        this.length= length;
    }

//Klassen implementere metoden calculateArea().
// Arealberegningen foretages ved at gange højde med længde.
    @Override
    public double calcuateArea() {

        double area = height*length;

        return area;

    }

}
