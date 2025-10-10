package Oct07;

public class Palindrome {
    public static void main(String[] args) {
        String city = "Toronto";
        String reverse = "";
        for (int i = city.length() - 1; i >= 0; i--) {
            city.charAt(i);
            //System.out.print(city.charAt(i));
            reverse += city.charAt(i);
        }
        System.out.println("Reversed : " + reverse);

        if (city.equals(reverse)) {
            System.out.print("It is a palindrome");
        } else {
            System.out.print("It is not a palindrome");
        }
    }
}
