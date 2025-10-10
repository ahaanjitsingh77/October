package Sept27;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] count = new int[10];
        System.out.println("Enter the count");
        for (int i = 0; i <count.length ; i++) {
            count[i] = scanner.nextInt();
        }
        System.out.println("printing the count : ");
        for (int i = 0; i < count.length ; i++) {
            System.out.println(count[i]);
        }
    }
}
