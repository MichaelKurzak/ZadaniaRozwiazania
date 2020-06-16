package a_Zadania.a_Dzien_1.a_Pierwsza_klasa;

public class BankAccount {
    private int number;
    private double cash = 4;

    public BankAccount(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public double getCash() {
        return cash;
    }


    public void depositCash(double amount) {
        if (cash >= 0) {
            cash = amount + cash;
        }
    }

    public double withdrawCash(double amount) {
        double score = cash - amount;
        if (score >= 0) {
            return amount;
        } else {
            return cash - cash;
        }
    }

    public String printInfo() {
        return "Numer konta " + number + "Stan " + cash;
    }
}



