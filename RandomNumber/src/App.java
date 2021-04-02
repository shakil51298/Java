import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String x = "My name is Md Khalid Hosain";
        System.out.println(x.charAt(5));

        String fullAd ="now with 20% more chicken" ; 
        String a = "yummmm .... my oh my chicken pot pie";
        System.out.println(a.charAt(a.length() -1));
        System.out.println("please input,whch index you  want to see : ");
        System.out.println(fullAd);
        System.out.println(fullAd.contains("shakil"));
        Scanner scanner = new Scanner(System.in);
        String index = scanner.nextLine(); 
        System.out.println(fullAd.indexOf(index));
        System.out.println(fullAd.concat("my"));
    }
}
