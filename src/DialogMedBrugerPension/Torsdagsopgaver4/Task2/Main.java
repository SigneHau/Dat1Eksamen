//2.a: create a Main class with a main method.
import java.util.Scanner;

	class Main{
	
	public static void main(String [] arg){

//2.b: In the main method start by printing a message to the user: 

   System.out.println("Please type your name");

//2.c: Create a Scanner object for reading the command line (remember to import the Scanner class from the util library:

   Scanner scanner = new Scanner(System.in);
//2.d: Declare a String variable
   String name = "";
   name = scanner.nextLine(); 

   System.out.println("Hey " + name + " Please type your age");

//2.f: Declare another variable of type int, age and assign it the value returned by the nextInt method of the Scanner object.
   Integer age = 0;
   age= scanner.nextInt();

// 2.g: Print the value the user writes (the age variable)
   System.out.println(age + " Years"); 


   //2.h: Declare a third variable of type int. To this variable, assign the calculated
        // number of years until the user can retire.
        // You may assume retirement starts at 67 years. Print the result.


   Integer pension = 67-age;

   System.out.println("You can retarrer in"  +  pension+ "years");

	}
  

} 