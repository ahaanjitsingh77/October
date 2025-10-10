package JavaClasses;

import java.util.Scanner;

public class Increment {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int N = scanner.nextInt();
        int x = 1;
        int sum = 0;
            while (x <= N){
                System.out.println(x);
                sum=sum+x;
                x++;
                System.out.println(sum);
        }

    }
}