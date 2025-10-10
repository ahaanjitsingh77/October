package JavaClasses;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input three number
        System.out.println("enter 1st number");
        int x = scanner.nextInt();
        System.out.println("enter 2nd number");
        int y = scanner.nextInt();
        System.out.println("enter 3rd number");
        int z = scanner.nextInt();
        //find the largest
        int largest;
        if (x>=y && x>=z) {
            largest = x;
        } else if (y>=x && y>=z){
            largest = y;
        } else {
            largest=z;
        }
        System.out.println("the largest number:" + largest);
    }
}
