package a_Zadania.a_Dzien_1.d_Konstruktory;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    public List<String> historyOfOperation;
    int operation = 0;
    public double result;

    public Calculator() {
        historyOfOperation = new ArrayList<>(10);

    }

    public void add(double num1, double num2) {
        result = num1 + num2;
        historyOfOperation.add("Added " + num1 + " to " + num2 + " got " + result);

    }

    public void multiply(double num1, double num2) {
        result = num1 * num2;
        historyOfOperation.add("Multiplied " + num1 + " with " + num2 + " got " + result);

    }

    public void subtract(double num1, double num2) {
        result = num1 - num2;
        historyOfOperation.add("Subtracted " + num1 + " from " + num2 + " got " + result);

    }

    public void divided(double num1, double num2) {
        if (num2 > 0) {
            result = num1 / num2;
        } else {
            result = Integer.parseInt("Nie można dzielić przez '0'");
        }

        historyOfOperation.add("Divided " + num1 + " by " + num2 + " got " + result);
    }

    public void printOperations() {

        System.out.println(historyOfOperation.size() + " " + historyOfOperation);
    }

    public void clearOperations() {


    }


}



