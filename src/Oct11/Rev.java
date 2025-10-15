package Oct11;

public class Rev {
    public static void main(String[] args) {
        String s1 = "Hello I am learning java";
        String[] s = s1.split(" ");
        for (int i = s1.length() - 1; i >= 0; i--) {
            s1.charAt(i);
            System.out.print(s1.charAt(i));
        }
    }
}
