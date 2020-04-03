package a_Zadania.a_Dzien_1.d_Konstruktory;

public class Calculator {
    private double result;
    public String score;
    public String free;
    String[] historyOfOperation;

    public String add(double num1, double num2) {
        result = num1 + num2;
        score = "Add " + num1 + " to " + num2 + " got " + result;
        return score;
    }

    public void multiply(double num1, double num2) {
        System.out.println(result = num1 * num2);
        score = "Multiplied " + num1 + " with " + num2 + " got " + result;

    }

    public void subtract(double num1, double num2) {
        System.out.println(result = num1 - num2);
        score = "Subtracted " + num1 + " from " + num2 + " got " + result;

    }

    public void divided(double num1, double num2) {
        if (num2 > 0) {
            result = num1 / num2;
        } else {
            result = Integer.parseInt("Nie można dzielić przez '0'");
        }
        score = "Divided " + num1 + " by " + num2 + " got " + result;
        System.out.println(score);
    }

    public Calculator() {
        historyOfOperation = new String[10];
        for (int i = 0; i < historyOfOperation.length; i++) {
            historyOfOperation[i] = score;
        }
    }


    public void printOperations() {

        for (int i = 0; i < 10; i++)
            System.out.println(historyOfOperation[i]);


    }

    public void clearOperations() {


    }


}



