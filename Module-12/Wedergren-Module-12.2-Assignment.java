// Amanda Wedergren
// July 20, 2025
// Module 12.2 Assignment

// Write a program with four methods for calculating the cost of a yearly auto service visit. The methods will be titled yearlyService.

public class AutoServiceCalculator {
    // Standard charges
    private static final double STANDARD_SERVICE = 125.0;
    private static final double OIL_CHANGE = 40.0;
    private static final double TIRE_ROTATION = 75.0;

    // yearlyService() - no parameters
    public static double yearlyService() {
        return STANDARD_SERVICE;
    }

    // yearlyService(oilChange)
    public static double yearlyService(boolean oilChange) {
        return STANDARD_SERVICE + (oilChange ? OIL_CHANGE : 0);
    }

    // yearlyService(oilChange, tireRotation)
    public static double yearlyService(boolean oilChange, boolean tireRotation) {
        double total = STANDARD_SERVICE;
        if (oilChange) total += OIL_CHANGE;
        if (tireRotation) total += TIRE_ROTATION;
        return total;
    }

    // yearlyService(oilChange, tireRotation, coupon)
    public static double yearlyService(boolean oilChange, boolean tireRotation, double coupon) {
        double total = yearlyService(oilChange, tireRotation);
        total -= coupon;
        return total < 0 ? 0 : total;
    }

    public static void main(String[] args) {
        // Test each method twice
        System.out.println("Standard service: $" + yearlyService());
        System.out.println("Standard service: $" + yearlyService());

        System.out.println("Service + oil change: $" + yearlyService(true));
        System.out.println("Service + no oil change: $" + yearlyService(false));

        System.out.println("Service + oil change + tire rotation: $" + yearlyService(true, true));
        System.out.println("Service + oil change + no tire rotation: $" + yearlyService(true, false));

        System.out.println("Service + oil change + tire rotation + $20 coupon: $" + yearlyService(true, true, 20.0));
        System.out.println("Service + oil change + tire rotation + $150 coupon: $" + yearlyService(true, true, 150.0));
    }
}

