package Lommeregner;

public class Calculator {

    //Attributten result, som starter med at være 0.
    private double result;

    public Calculator() {
        result = 0;
    }

    //En getter-metode til result.
    public double getResult() {
        return result;
    }

    public void add(double x) {
        result += x;
    }

    public void subtract(double x) {
        result -= x;
    }

    public void clear() {
        result = 0;
    }

    public void add(double[] numbers) {

        for (double number : numbers) {
            result += number;
        }

    }

}


