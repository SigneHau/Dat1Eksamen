package Lommeregner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();


        calculator.add(5.5); // kalder metoden fra Calculater
        System.out.println("Resultatet når der tilføjes 5,5  " + calculator.getResult());

        calculator.subtract(4.0); // kalder metoden fra Calculater
        System.out.println("Resultatet når der trækkes 4,0 fra  " + calculator.getResult());

        calculator.clear();
        System.out.println("Resultat efter nulstilling: " + calculator.getResult());


        double[] numbers = {10.5, 4.0, 2.5};
        calculator.add(numbers);
        System.out.println("Resultat efter tilføjelse af arrayet [10.5, 4.0, 2.5]: " + calculator.getResult());
    }
}

