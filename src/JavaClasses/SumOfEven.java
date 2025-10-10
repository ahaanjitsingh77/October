package JavaClasses;

public class SumOfEven {
    public static void main(String[] args) {
        int N = 100;
        int x = 0;
        for (int i = 1; i <= N; i++) {
            int odd = 2* i-1;
            x+= odd;
        }
        System.out.println ("Sum of first " + N + " odd numbers is: " + x);

    }
}
