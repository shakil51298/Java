import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String x = "hello world\n";
        String password = "let me in";

        System.out.println("guess the password : ");
        Scanner scanner = new Scanner(System.in);
        String guess = scanner.nextLine();
        System.out.println(x.toUpperCase());  
        System.out.println(x.substring(0, 3));  
        System.out.println(x.repeat(200));
        System.out.println(password.equals(guess));

        System.out.println("shakil" == "shakil");

        String a = "hi";
        String b = "hi";
        System.out.println(a==b);

        int num1 = 10; 
        int num2 = 10;
        System.out.println(num1 == num2);
    }
}
