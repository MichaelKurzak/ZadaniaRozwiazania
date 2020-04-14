package a_Zadania.a_Dzien_1.f_Wyjatki;


public class Test extends Throwable {

    public void printMessage(String message) {
        if (message == null) {
            throw new IllegalArgumentException();
        } else {
            System.out.println(message);
        }

    }
}

