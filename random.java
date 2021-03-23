import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        int random = randomNumber.nextInt(6);
        System.out.println(random);
    }
}
