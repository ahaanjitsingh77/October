package Oct11;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Ahaanjit";
        student.email = "Ahaanjit@gmail.com";
        student.learn = "is learning Java";

        System.out.println(student.name);

        student.study();
        student.talks();
        student.walks();
    }

}
