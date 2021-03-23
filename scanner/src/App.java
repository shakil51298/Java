import java.util.Scanner;

public class App {

    // public static final int  x = 12045; // global variable
    // const ==> final int x;
    // Private int sha = 1520;
    public static void main(String[] args) throws Exception {
        System.out.println("what is your name?");
        Scanner scanner = new Scanner(System.in);
        System.out.printf("type here your name: ");
        String inputUrnmae = scanner.nextLine();
        System.out.println("hello " + inputUrnmae);

        // String s = "hello, world"; //  String  literals
        // System.out.println("String : my name is Md Khalid Hossain" + s); 

        // char a = 'a'; 
        // System.out.println("Char : "+ a); // character literals

        // int number = 123456;
        // System.out.println("intiger: " + number); // intiger literals
    
        // System.out.println(15.360); // floting point literals
        
        // sum of two numbers 
        // int num1 = 120, num2 = 20, sum;
        //  sum = num1 + num2;
        // System.out.println("sum of '120' and '20' is : " + sum);

        // String string = new String("This is String");
        // String easier = "Wow,its so easy, " + string;
        // System.out.println(easier);
        
        //  System.out.println(x);
    
    
    }
}
