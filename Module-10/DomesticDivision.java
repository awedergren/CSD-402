// Amanda Wedergren
// June 30, 2025
// Module 10.2 Assignment

// Create a class called DomesticDivision that extends Division and includes a state field.

public class DomesticDivision extends Division {
    private String state;

    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    @Override
    public void display() {
        System.out.println("Domestic Division: " + divisionName + ", Account: " + accountNumber + ", State: " + state);
    }
}
