package a_Zadania.a_Dzien_1.f_Wyjatki;


public class Main1 {

    public static void main(String[] args) {
        try {
            System.out.println(factorial(2));
            System.out.println("Positive number");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();
            System.out.println("Negative number");
        }

    }

    static int factorial(int number) {
        int result = 1;
        if (number < 0) {
            throw new IllegalArgumentException();
        } else {
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
            return result;

        }
    }
}
