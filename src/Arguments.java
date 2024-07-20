// Example 1: Demonstrating the use of varargs in a method

public class Arguments {

    public static void main(String[] args) {
        // Calling the add method with multiple integer arguments
        add(4, 7, 68, 4, 74, 1, 7, 47, 73, 4, 42);
    }

    // Method to add multiple integers using varargs
    public static void add(int... numbers) {
        int result = 0;
        // Loop through each number and add it to the result
        for (int number : numbers) {
            result += number;
        }
        // Print the result
        System.out.println("Sum: " + result);
    }
}
