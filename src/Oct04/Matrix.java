package Oct04;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                System.out.println("Enter the value : ");
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k <arr.length ; k++) {
                    System.out.print(arr[j][k] + " ");

                }
                System.out.println();
            }
    }
}
