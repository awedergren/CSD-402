// Amanda Wedergren
// June 30, 2025
// Module 10.2 Assignment

// Create a class called UseDivision that creates instances of InternationalDivision and DomesticDivision, and displays their information.


public class UseDivision {
    public static void main(String[] args) {
        // Two InternationalDivision instances
        InternationalDivision intDiv1 = new InternationalDivision("Europe Sales", 1001, "Germany", "German");
        InternationalDivision intDiv2 = new InternationalDivision("Asia Sales", 1002, "Japan", "Japanese");

        // Two DomesticDivision instances
        DomesticDivision domDiv1 = new DomesticDivision("East Coast", 2001, "New York");
        DomesticDivision domDiv2 = new DomesticDivision("West Coast", 2002, "California");

        // Display all
        intDiv1.display();
        intDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}
