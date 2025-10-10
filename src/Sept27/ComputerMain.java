package Sept27;

public class ComputerMain {
    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.color = "Black";
        computer.brand = "HP";
        computer.Processor = "Corei7";

        computer.run();
        computer.surf();
        computer.games();

    }
}
