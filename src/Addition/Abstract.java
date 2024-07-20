package Addition;

// Abstract class implementing the interface
public abstract class Abstract implements Connect {

    // Abstract method to be implemented by subclasses
    public abstract void name();

    // Concrete method providing a default implementation
    public void display() {
        System.out.println("Displaying information.");
    }
}
