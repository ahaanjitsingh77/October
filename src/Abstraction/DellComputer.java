package Abstraction;

public class DellComputer extends Computer{
    @Override
    public void Internet() {
        System.out.println("you can surf using internet");
    }

    @Override
    public void Games() {
        System.out.println("Games can be played ");

    }
}
