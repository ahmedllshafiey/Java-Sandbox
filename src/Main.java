
import Addition.Abstract;
import Addition.Side;
import Addition.Collections;

public class Main {

    public static void main(String[] args) {
        // Test Side class
        Side side1 = new Side();
        side1.displayDetails();

        Side side2 = new Side(2, "Custom Name");
        side2.displayDetails();

        // Test Abstract class implementation
        Concrete concrete = new Concrete();
        concrete.name();
        concrete.connect();
        concrete.display();

        // Run Collections example
        Collections.main(args);
    }
}

// Concrete class extending Abstract class and implementing the abstract method
class Concrete extends Abstract {

    @Override
    public void name() {
        System.out.println("Concrete class name method implementation.");
    }

    public void connect() {
        System.out.println("Concrete class connect method implementation.");
    }
}
