package Addition;

public class Nested { // outer class

    public int age;
    public String name;

    void print() {
        System.out.println(age);
    }

    // to use inner class properties in outer class, create an object of the inner class
    Inner n = new Inner();

    void useInnerClassProps() {
        // Accessing inner class property
        // To access inner class must be in the method
        System.out.println(n.age);
    }

    class Inner { // inner class
        // inner class can use outer class methods and properties

        int age;

        public void call() {
            System.out.println(age);
        }
    }

    public static void main(String[] args) {
        Nested outer = new Nested();
        outer.age = 30;
        outer.name = "John Doe";
        outer.print();

        Nested.Inner inner = outer.new Inner();
        inner.age = 25;
        inner.call();

        outer.useInnerClassProps();
    }
}
