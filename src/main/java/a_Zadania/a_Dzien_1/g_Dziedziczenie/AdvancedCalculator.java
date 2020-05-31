package a_Zadania.a_Dzien_1.g_Dziedziczenie;

import a_Zadania.a_Dzien_1.d_Konstruktory.Calculator;

public class AdvancedCalculator extends Calculator {

    public void pow(double num1, double num2) {

        result = num1;
        double tmp = num2;

        while (tmp > 1) {
            result *= num1;
            tmp--;
        }
        historyOfOperation.add("Pow" + "Number " + num1 + " ^ " + num2 + " equals " + result);
    }


    public void root(double num1, double num2) {

        double squareRoot = num1 / num2;

        do {
            result = squareRoot;
            squareRoot = (result + (num1 / result)) / num2;
        } while ((result - squareRoot) != 0);

        historyOfOperation.add("Root " + "num2 " + num2 + " root of " + num1 + " equals " + result);

        // do poprawy
    }
}
