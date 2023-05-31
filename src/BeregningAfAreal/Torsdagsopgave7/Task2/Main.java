package BeregningAfAreal.Torsdagsopgave7.Task2;

public class Main {
    public static void main(String[] args) throws Exception {
        Cirkel cirkel = new Cirkel();
        cirkel.setRadius(2.0);                        // I GENNEMGANGEN BRUGTE HAN TRY AND CATCH
        double a = cirkel.getAreal();
        System.out.println("Arealet af cirklen " + a);

    }


}
