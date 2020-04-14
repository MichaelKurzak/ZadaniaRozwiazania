package a_Zadania.a_Dzien_1.f_Wyjatki;

public class Main2 {

    public static void main(String[] args) {
        int[] tab = {5, 1, 6, 7, 8};
        try {
            System.out.println(tab[21]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();
            System.out.println("Array is to short");
        }
    }
}
