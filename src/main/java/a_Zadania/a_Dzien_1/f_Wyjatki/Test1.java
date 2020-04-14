package a_Zadania.a_Dzien_1.f_Wyjatki;

public class Test1 {
    public static void main(String[] args) {
        Test test = new Test();
        try {
            test.printMessage(null);
            System.out.println("Message successfully printed");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();
            System.out.println("Message is null");
        }

    }

}
