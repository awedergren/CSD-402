// Amanda Wedergren
// June 30, 2025
// Module 10.2 Assignment

// Create a class called InternationalDivision that extends Division and includes country and language fields.

public class InternationalDivision extends Division {
    private String country;
    private String language;

    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    @Override
    public void display() {
        System.out.println("International Division: " + divisionName + ", Account: " + accountNumber + ", Country: " + country + ", Language: " + language);
    }
}
