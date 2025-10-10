package Sept27;

public class CalculatorMain1 {
    public static void main(String[] args) {

        Calculator1 calculator1 = new Calculator1();
        double sum = calculator1.sum(20,30);
        System.out.println("Result is : " + sum);

        double sub = calculator1.sub(35,10);
        System.out.println("Result is : " + sub);

        double mul = calculator1.mul(7,7);
        System.out.println("Result is : " + mul);

        double div = calculator1.div(10,2);
        System.out.println("Result is : " + div);

    }
}