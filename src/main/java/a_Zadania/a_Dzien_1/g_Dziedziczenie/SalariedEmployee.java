package a_Zadania.a_Dzien_1.g_Dziedziczenie;


public class SalariedEmployee extends Employee {

    public SalariedEmployee(int id, String firstName, String lastName, double wage) {
        super(id, firstName, lastName, wage);
    }

    public final double calculatePayment() {
        return 190 * wage ;
    }


}
