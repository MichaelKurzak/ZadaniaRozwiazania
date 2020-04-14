package a_Zadania.a_Dzien_1.f_Wyjatki;


public class Main5 {

    public static void main(String[] args) {


        try {
            int num = Integer.parseInt("1");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Input String");

        } finally {
            System.out.println("I working always");
        }
    }


}
