package ch07.basic.sec04;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 5;

        Calculator calculator = new Calculator();
        Computer computer = new Computer();

        System.out.println(calculator.areaCircle(r) + "\n" + computer.areaCircle(r));
    }
}
