package Oct11;

public class Practice {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("October");
        sb.append(" Month ");
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.compareTo(sb));
        System.out.println(sb.capacity());
    }
}
