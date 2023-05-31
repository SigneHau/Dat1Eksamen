
package BeregningAfAreal;

//Skriv en klasse Shapes, som har en samling af Shape-objekter.
import java.util.ArrayList;

public class Shapes {
    private ArrayList<Shape> shapes;


    public Shapes(){
        shapes = new ArrayList<>();

    }
    //Skriv en metode addShape(Shape s) i klassen,
    // som kan bruges til at tilføje Shape-objekter til samlingen.
   public void addShapes(Shape s){
     shapes.add(s);

    }

    //Skriv en metode public double totalArea() som beregner det samlede areal af alle Shape-objekterne.
    public double totalArea(){
       double area= 0;
    for (Shape s : shapes){
       area += s.calcuateArea();

           }
    return area;
     }

}
