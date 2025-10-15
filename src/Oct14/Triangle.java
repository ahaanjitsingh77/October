package Oct14;

public class Triangle extends Shape {
    double base;
    double height;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }
    @Override
    void area() {
        System.out.println("area of triangle :" + (height * base) / 2);
    }
}