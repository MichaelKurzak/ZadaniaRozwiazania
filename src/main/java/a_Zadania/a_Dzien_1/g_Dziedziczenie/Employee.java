package a_Zadania.a_Dzien_1.g_Dziedziczenie;


public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private double wage;

    public Employee(int id, String firstName, String lastName, double wage) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.wage = wage;
    }

    public double raiseWage(double percent) {
        double result = 0;

        if (wage >= 0) {
            result = wage * percent;
        }
        return result;
    }


}
