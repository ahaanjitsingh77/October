package JavaClasses;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        System.out.println("welcome to the lottery system");
        System.out.println("Pick the number from 1-100");
        Scanner scanner = new Scanner(System.in);
        int picknumber;
        int luckynumber = 55;

        for (picknumber = 1; picknumber <= 3; picknumber ++) {
            System.out.print(" Attempt " + picknumber + ": Enter your guess: ");
            int guess = scanner.nextInt();
                if(guess == luckynumber) {
                System.out.println("you won");
                break;
                }   else { System.out.println(" Wrong guess.");
                    continue;
            }
        }
    }
}
