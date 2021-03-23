public class App {
    public static void main(String[] args) throws Exception {
        double b, z , x , y , power;
		x = 3.1;
		y = 5;
		z = 52;
		b = 1/ (9 + ( y * y));
		power = Math.pow(b, .5);
		z = 2/ y + x * power;
		System.out.println(z);
    }
}
