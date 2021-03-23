public class App {
    public static void main(String[] args) throws Exception {
        int product = 1 , limit = 10;
        for (int i = 1; i <=limit; i++) {
            product = product * i;
            System.out.println(product);
        }
    }
}
