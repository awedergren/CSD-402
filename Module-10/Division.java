// Amanda Wedergren
// June 30, 2025
// Module 10.2 Assignment

// Create an abstract class called Division with a constructor that takes a division name and an account number.

public abstract class Division {
    protected String divisionName;
    protected int accountNumber;

    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    public abstract void display();
}
