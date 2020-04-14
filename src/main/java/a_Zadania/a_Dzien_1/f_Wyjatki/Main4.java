package a_Zadania.a_Dzien_1.f_Wyjatki;


public class Main4 {

    public static void main(String[] args) {
        int a = 1, b = 0, c;
        try {
            c = a / b;
            System.out.println(c);


        } catch (ArithmeticException ex) {
            System.out.println("Arithmetic Exception: You can't divide by 0");

        } catch (Exception ex) {
            System.out.println("Exception");

        }
    }


}
