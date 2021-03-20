import java.util.Random; // import for getting random number 
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    // ==> syntax of an object 
//    =>Type => indetifire / variabale = 'new' keyword => type ();
        Random  thisIsRanDom = new Random();
        int result =  thisIsRanDom.nextInt(9999999) + 1;
        System.out.println( "You rolled a : " + result);
        System.out.println( "You rolled a : " + 10 +result);

        System.out.print("dog cat fish");  // rander as a single line
        System.out.println();
        System.out.println("lion");
        System.out.println("Tiger");
        System.out.print(" ... ");
        System.out.print("Shakb khan ");

        System.out.printf (" Shakil khan");  // rander as single line also
        System.out.printf (" Shakil khan"); 

        System.out.println("what is your name?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("hello" + name);
    }
}
