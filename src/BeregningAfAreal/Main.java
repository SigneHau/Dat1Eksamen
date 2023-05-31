package BeregningAfAreal;

public class Main {
    public static void main(String[] args) {
//3. Skriv en klasse Main med en main-metode.
//Opret et Square-objekt og et Circle-objekt i main-metoden
// og test at deres calculateArea()-metoder virker.


        Square square = new Square(5,5);
        double squareAreal = square.calcuateArea();
        System.out.println("square areal:"+ squareAreal);


        Circle circle = new Circle(10);
        double circleAreal = circle.calcuateArea();
        System.out.println("circle areal:"+ circleAreal);



        Shapes shapes = new Shapes();
       // shapes.addShapes(new Square(5,10));
        shapes.addShapes(square);

       // shapes.addShapes(new Circle(25));
        shapes.addShapes(circle);
        double totalArea=shapes.totalArea();
        System.out.println("Total area of shapes: " + totalArea);
    }

}

