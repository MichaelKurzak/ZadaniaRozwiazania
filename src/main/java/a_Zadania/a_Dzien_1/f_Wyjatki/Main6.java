package a_Zadania.a_Dzien_1.f_Wyjatki;


public class Main6 {

    public static void main(String[] args) {
        try {
            System.out.println(divide(25, 5));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Divide to 0");

        }

    }

    static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException();
        } else {
            int c = a / b;
            return c;
        }


    }


}
