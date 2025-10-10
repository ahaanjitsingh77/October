package JavaClasses;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("welcome to calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modules");
            System.out.println("6. Exit");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter first number");
                    int num1 = scanner.nextInt();
                    System.out.println("Enter second number");
                    int num2 = scanner.nextInt();
                    System.out.println("Result:" + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Enter first number");
                    num1 = scanner.nextInt();
                    System.out.println("Enter second number");
                    num2 = scanner.nextInt();
                    System.out.println("Result:" + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Enter first number");
                    num1 = scanner.nextInt();
                    System.out.println("Enter second number");
                    num2 = scanner.nextInt();
                    System.out.println("Result:" + (num1 * num2));
                    break;
                case 4:
                    System.out.println("Enter first number");
                    num1 = scanner.nextInt();
                    System.out.println("Enter second number");
                    num2 = scanner.nextInt();
                    System.out.println("Result:" + (num1 / num2));
                    break;
                case 5:
                    System.out.println("Enter first number");
                    num1 = scanner.nextInt();
                    System.out.println("Enter second number");
                    num2 = scanner.nextInt();
                    System.out.println("Result:" + (num1 % num2));
                    break;
                case 6:
                    System.out.println("exiting the calculator");
                    break;
                default:
                    System.out.println("invalid, try again");
            }
// ask user for whether you want continue or not.
            System.out.println("Do you want to continue or not");

        } while (choice!=6);
    }
}


