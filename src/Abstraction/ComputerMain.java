package Abstraction;

public class ComputerMain {
    public static void main(String[] args) {
        Computer computer = new DellComputer();
        computer.Games();
        computer.Internet();
        computer.keyboard();
        Computer computer1 = new AppleComputer();
        computer.Games();
        computer.Internet();
        computer.keyboard();
        Computer computer2 = new HpComputer();
        computer.Games();
        computer.Internet();
        computer.keyboard();

    }
}
