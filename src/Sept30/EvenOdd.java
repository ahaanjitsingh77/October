package Sept30;

public class EvenOdd {
    public static void main(String[] args) {
        int[] arr = {10, 23, 234, 343, 34};

        for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0){
                System.out.println( arr[i]+ " is even ");
            }   else {
                System.out.println(arr[i] + " is odd ");
            }

        }

    }
}
