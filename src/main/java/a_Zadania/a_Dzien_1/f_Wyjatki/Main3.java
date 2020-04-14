package a_Zadania.a_Dzien_1.f_Wyjatki;

public class Main3 {

    public static void main(String[] args) {
        showLength(null);
    }

    static void showLength(String s) throws NullPointerException {
        System.out.println(s.length());
    }

}
