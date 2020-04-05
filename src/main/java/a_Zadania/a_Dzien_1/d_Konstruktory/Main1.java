package a_Zadania.a_Dzien_1.d_Konstruktory;

public class Main1 {


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(5,6);
        calculator.divided(10,5);
        calculator.subtract(20,22);
        calculator.add(10,10);
        calculator.multiply(50,20);
        calculator.add(50,20);

        calculator.printOperations();

    }

}
