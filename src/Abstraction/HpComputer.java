package Abstraction;

public class HpComputer extends Computer{
    @Override
    public void Internet() {

    }

    @Override
    public void Games() {

    }

    @Override
    public void keyboard() {
        super.keyboard();
        System.out.println("Scientific Calculator can be used");
    }
}
