package DialogMedBrugerPension;
import java.util.Scanner;

//1. Skriv en klasse Dialog. Klassen skal have attributten
//    • currentYear
//    Attributten repræsenterer det år, vi er i og den sættes via klassens constructor.
public class Dialog {
        int currentYear = 2023;

    public Dialog(int currentYear){

        this.currentYear = currentYear;
        }


        //2. Klassen Dialog skal have metoden public void getYearOfBirth(). I metoden skal der ske følgende
    //1. Metoden skriver til brugeren (System.out.println()) og beder brugeren indtaste sit fødselsår.
        public void getYearOfBirth() {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Skriv det årstal du er født ");

            int birthYear = scanner.nextInt();



            //2. Metoden kalder en ny metode public int getYearsToRetirement(int i) med fødselsåret som argument (denne metode skal du lave om lidt).
            // 3. Metoden skriver resultatet fra getYearsToRetirement (int i) til brugeren. Du kan fx skrive noget lignende “Du har nu 27 år til pensionering.” til din bruger.
            int yearsToRetirement = getYearsToRetirement(birthYear);
            System.out.println("Du har nu " + yearsToRetirement + " år til pensionering.");

        }

   //3. Metoden getYearsToRetirement(int i) skal gøre følgende
   //1. Lægge 67 til fødselsåret, som er givet som parameter til metoden (int i).
   // Dette giver pensionsåret. 2. Trække currentYear fra pensionsåret for at finde ud af hvor længe der er til pension for brugeren.
   //3. Returner resultatet fra metoden.
    public int getYearsToRetirement(int birthYear){

        int retirementYear = birthYear + 67;

        int yearsToRetirement= retirementYear - currentYear;


        return yearsToRetirement;

    }
}


/*
Hvis du har tid:
Lav nogle tjek på det input du får fra brugeren.
Input skal være et tal med fire cifre, det må ikke være negativt
og det må ikke være højere end currentYear. Skriv til brugeren,
 hvis input er ugyldigt

public void getYearOfBirth() {
    Scanner scanner = new Scanner(System.in);

    int birthYear = 0;
    boolean isValidInput = false;

    while (!isValidInput) {
        System.out.println("Indtast dit fødselsår:");
        String input = scanner.nextLine();

        // Tjekker om inputtet er et tal med fire cifre
        if (input.matches("\\d{4}")) {
            birthYear = Integer.parseInt(input);

            // Tjekker om fødselsåret er gyldigt
            if (birthYear > 0 && birthYear <= currentYear) {
                isValidInput = true;
            } else {
                System.out.println("Ugyldigt fødselsår. Prøv igen.");
            }
        } else {
            System.out.println("Ugyldigt input. Indtast venligst et tal med fire cifre.");
        }
    }

    int yearsToRetirement = getYearsToRetirement(birthYear);
    System.out.println("Du har nu " + yearsToRetirement + " år til pensionering.");
}
*/