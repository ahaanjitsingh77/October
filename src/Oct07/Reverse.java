package Oct07;

public class Reverse {
    public static void main(String[] args) {
        String city = "Toronto";
        for (int i = city.length() - 1; i >= 0; i--){
            city.charAt(i);
            System.out.print(city.charAt(i));
        }
    }
}
