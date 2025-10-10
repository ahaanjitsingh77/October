package JavaClasses;

import java.util.Scanner;

public class IVR2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Press 1 for english");
        System.out.println("2. Press 2 for French");
        System.out.println("enter the choice");
        int Choice = scanner.nextInt();
        if (Choice == 1) {
            System.out.println("1. Press 1 for sales");
            System.out.println("2. Press 2 for tech support");
            System.out.println("3. Press 3 for tech billing");
            System.out.println("4. Press 4 for tech feedback");
            System.out.println("enter your choice");
            } int sales = scanner.nextInt();
                if (sales == 1) {
                System.out.println("1. Press 1 for offers");
                System.out.println("2. Press 2 for discount");
            }   else if (sales == 2) {
                    System.out.println("discount");
                } else {
                    System.out.println("invalid");}
                int offers  = scanner.nextInt();
                if (offers== 1) {
                System.out.println("1. Press 1 for mobile");
                System.out.println("2. Press 2 for iphone17");
            } else if (offers == 2) {
                System.out.println("you select iphone17");
                } else {
                    System.out.println("invalid");
                }
    }
}
