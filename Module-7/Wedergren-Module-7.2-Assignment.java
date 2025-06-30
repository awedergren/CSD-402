// Amanda Wedergren
// June 27, 2025
// Module 7.2 Assignment

// Create a new class of UseFans that creates a collection of fan instances and uses the 'this' reference throughout.

import java.util.ArrayList;
import java.util.Collection;

class Fan {
    // Constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-argument constructor (default values)
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }

    // Constructor with arguments
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getter and Setter for speed
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= STOPPED && speed <= FAST) {
            this.speed = speed;
        } else {
            System.out.println("Invalid speed. Please use STOPPED, SLOW, MEDIUM, or FAST.");
        }
    }

    // Getter and Setter for on
    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    // Getter and Setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius must be greater than 0.");
        }
    }

    // Getter and Setter for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method to display fan details
    @Override
    public String toString() {
        if (on) {
            return "Fan is ON [Speed: " + speed + ", Radius: " + radius + ", Color: " + color + "]";
        } else {
            return "Fan is OFF [Radius: " + radius + ", Color: " + color + "]";
        }
    }

    // Method to display Fan details without using toString()
    public void displayFanDetails() {
        System.out.println("Fan Details:");
        System.out.println("Speed: " + this.speed);
        System.out.println("Is On: " + this.on);
        System.out.println("Radius: " + this.radius);
        System.out.println("Color: " + this.color);
    }

    // Main method for testing Fan class
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        System.out.println("Default Fan:");
        fan1.displayFanDetails();
        System.out.println();

        Fan fan2 = new Fan(Fan.FAST, true, 12.0, "black");
        System.out.println("Custom Fan:");
        fan2.displayFanDetails();
        System.out.println();
    }
}

class FanTest {
    public static void main(String[] args) {
        // Create a Fan using the default constructor
        Fan defaultFan = new Fan();
        System.out.println("Default Fan:");
        defaultFan.displayFanDetails();
        System.out.println();

        // Create a Fan using the argument constructor
        Fan customFan = new Fan(Fan.FAST, true, 10.0, "red");
        System.out.println("Custom Fan:");
        customFan.displayFanDetails();
        System.out.println();

        // Demonstrate functionality of Fan methods
        defaultFan.setOn(true);
        defaultFan.setSpeed(Fan.MEDIUM);
        defaultFan.setColor("green");
        defaultFan.setRadius(7.5);
        System.out.println("Updated Default Fan:");
        defaultFan.displayFanDetails();
        System.out.println();

        customFan.setOn(false);
        System.out.println("Updated Custom Fan:");
        customFan.displayFanDetails();
        System.out.println();
    }
}

class UseFans {
    // Method to display a collection of Fan instances without using toString()
    public static void displayFans(Collection<Fan> fans) {
        for (Fan fan : fans) {
            fan.displayFanDetails();
            System.out.println("-------------------");
        }
    }

    // Method to display a single Fan instance without using toString()
    public static void displaySingleFan(Fan fan) {
        fan.displayFanDetails();
    }

    // Main method to test functionality
    public static void main(String[] args) {
        // Create a collection of Fan instances
        Collection<Fan> fans = new ArrayList<>();
        fans.add(new Fan(Fan.FAST, true, 10.0, "blue"));
        fans.add(new Fan(Fan.MEDIUM, true, 6.0, "green"));
        fans.add(new Fan(Fan.SLOW, true, 8.0, "yellow"));

        // Display all fans in the collection
        System.out.println("Displaying all fans:");
        displayFans(fans);

        // Display a single fan
        System.out.println("Displaying a single fan:");
        displaySingleFan(new Fan(Fan.STOPPED, false, 9.0, "red"));
    }
}




