package Addition;

// Call inner class from another class
public class InnerCall {

    public static void main(String[] args) {
        // 1 - Create an object of the outer class
        Nested n = new Nested();

        // 2 - Create an object of the inner class using the outer class object
        Nested.Inner inner = n.new Inner();

        // Example usage of outer and inner class methods
        n.age = 30;
        n.name = "John Doe";
        n.print();

        inner.age = 25;
        inner.call();
    }
}
