package Encapsulation;

public class LoginStudentRun {
    public static void main(String[] args) {
        LoginStudent loginStudent = new LoginStudent("Ahaanjit","Ahaanjit123");
        System.out.println("Username : " + loginStudent.getUsername());
        loginStudent.setPassword("Ahaanjit111");
        loginStudent.setUsername("Ahaanjit", "Ahaanjit111");

    }
}
