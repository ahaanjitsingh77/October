package Oct04;

import java.util.Scanner;

public class TwoAdd {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println("Enter the value : ");
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int j = 0; j < arr1.length; j++) {
            for (int k = 0; k < arr1.length; k++) {
                System.out.println("Enter the value of arr 1: ");
                arr1[j][k] = scanner.nextInt();
            }
        }
        for (int k = 0; k < arr1.length; k++) {
            for (int l = 0; l < arr1.length; l++) {
                arr2[k][l] = arr[k][l] + arr1[k][l];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();

        }
    }


}

