package Oct04;

public class demo {
    public class StaticDemo {
    // Static variable (shared by class)
    static int count;

    // Static block (runs once before main)
    static {
        count = 10;
        System.out.println("Static block executed → count initialized to " + count);
    }

    // Static method (can be called without object)
    static void showCount() {
        System.out.println("Static method called → count = " + count);
    }

    public static void main(String[] args) {
        System.out.println("Main method started.");

        // Access static variable directly
        System.out.println("Accessing static variable directly → count = " + count);

        // Call static method directly
        showCount();

        // Modify static variable
        count = 25;
        System.out.println("Static variable updated → count = " + count);

        // Call static method again
        StaticDemo.showCount();
    }
}

}
