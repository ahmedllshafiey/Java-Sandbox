// Example 8: Demonstrating variable scope

public class Scope {

    public static void main(String[] args) {
        int firstNumber = 20, secondNumber = 100, result;
        result = firstNumber + secondNumber;

        if (result > 100) {
            int tax = (result * 5) / 100;
            System.out.println("Tax: " + tax);
        }

        // System.out.println(tax); // Invalid: 'tax' is out of scope here
    }
}
