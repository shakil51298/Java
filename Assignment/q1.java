public class q1 {

    // ==> first question:
    // ==>first i declare a defult variable named num = 1;
    // ==> then i through  a lopp it can be solve also through a while loop;
    public static void main(String[] args) {

        int num = 1;
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }
}