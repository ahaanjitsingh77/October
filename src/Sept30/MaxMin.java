package Sept30;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {10, 23, 234, 343, 34};

        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The maximum number is :" + max);
        System.out.println("The minimum number is :" + min);

    }
}
