package a_Zadania.a_Dzien_1.d_Konstruktory;

import a_Zadania.a_Dzien_1.g_Dziedziczenie.AdvancedCalculator;

public class Main1 {


    public static void main(String[] args) {

        AdvancedCalculator calculator = new AdvancedCalculator();
        calculator.add(5, 6);
        calculator.multiply(7, 10);
        calculator.subtract(11, 55);
        calculator.divided(10, 2);
        calculator.pow(5, 3);
        calculator.root(25, 2);

        calculator.printOperations();
    }


}