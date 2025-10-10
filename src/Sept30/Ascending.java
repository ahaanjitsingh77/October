package Sept30;

public class Ascending {
    public static void main(String[] args) {
        int[] arr = {10, 23, 234, 343, 34};

        System.out.println("Before sorting");
        for (int num : arr ) {
            System.out.println( num + " " );
        }
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i + 1; j < arr.length ; j++) {
                    if (arr[i] > arr[j]) {
                    int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                }

                }

            }
                System.out.println("After sorting");
                for (int num : arr){
                System.out.println( num + " ");
        }


    }
}
