package a_Zadania.a_Dzien_1.d_Konstruktory;

public class Main1 {


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(5, 6);
        calculator.multiply(7,10);
        calculator.subtract(11,55);

        calculator.printOperations();

    }

}
