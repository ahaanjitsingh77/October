package Encapsulation;

public class LoginStudent {
    private String Username;
    private String password;

    public LoginStudent(String Username, String password) {
        this.Username = Username;
        this.password = password;
    }

    public String getUsername() {
        return Username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username, String password) {
        if (Username.equalsIgnoreCase(this.Username) && password.equalsIgnoreCase(this.password)) {
            System.out.println("You are Logged in");
            System.out.println("Welcome to the app");
        } else {
            System.out.println("Authentication failed");
        }
    }
}
