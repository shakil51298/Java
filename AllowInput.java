import java.util.Scanner;

public class AllowInput {
    public static void main(String[] args) {
        System.out.printf("Enter First  integer Value : ");
        Scanner Scanner1 = new Scanner(System.in);
        int firstValue = Scanner1.nextInt();
        System.out.printf("enter second intiger value : ");
        Scanner Scanner2 = new Scanner(System.in);
        int secondValue = Scanner2.nextInt();
        
        int sum , sub , mul , div ;
        sum = firstValue + secondValue;
        sub = firstValue - secondValue;
        mul = firstValue * secondValue;
        div = firstValue / secondValue;
        System.out.println("Sum of this two integer : " + sum );        
        System.out.println("Substractoin of this two integer :"  + sub);        
        System.out.println("Multiplication of these two intiger : " + mul);        
        System.out.println("Division of these two intiger : " + div);        
        
    }
}
