package a_Zadania.a_Dzien_1.d_Konstruktory;

public class Calculator {

    String[] historyOfOperation;
    int operation;
    double result;

    public Calculator() {
        historyOfOperation = new String[0];

    }

    public void add(double num1, double num2) {
        result = num1 + num2;
        if (historyOfOperation[operation] == null) {
            historyOfOperation[operation] = "Added " + num1 + " to " + num2 + " got " + result;
            operation++;
        }

    }

    public void multiply(double num1, double num2) {
        result = num1 * num2;
        if (historyOfOperation[operation] == null) {
            historyOfOperation[operation] = "Multiplied " + num1 + " with " + num2 + " got " + result;
            operation++;
        }
    }

    public void subtract(double num1, double num2) {
        result = num1 - num2;
        if (historyOfOperation[operation] == null) {
            historyOfOperation[operation] = "Subtracted " + num1 + " from " + num2 + " got " + result;
            operation++;
        }
    }

    public void divided(double num1, double num2) {
        if (num2 > 0) {
            result = num1 / num2;
        } else {
            result = Integer.parseInt("Nie można dzielić przez '0'");
        }
        if (historyOfOperation[operation] == null) {
            historyOfOperation[operation] = "Divided " + num1 + " by " + num2 + " got " + result;
            operation++;
        }
    }

    public void printOperations() {
        for (int i = 0; i < historyOfOperation.length; i++)
            System.out.println(i + " " + historyOfOperation[i]);
    }

    public void clearOperations() {


    }


}



