package Oct11;

public class Rev {
    public static void main(String[] args) {
        String s1 = "Hello I am learning java";
        String[] words = s1.split(" ");

        StringBuilder result = new StringBuilder();
        for (String word : words) {
            StringBuilder stringBuilder = new StringBuilder(word);
            result.append(stringBuilder.reverse() + " ");
        }
        System.out.println(result);
    }
}
