package a_Zadania.a_Dzien_1.g_Dziedziczenie;


public class HourlyEmployee extends Employee {

    public HourlyEmployee(int id, String firstName, String lastName, double wage) {
        super(id, firstName, lastName, wage);
    }

    public double calculatePayment(double hours) {

        return hours * wage;

    }

}
