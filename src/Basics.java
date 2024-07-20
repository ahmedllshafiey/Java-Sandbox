// Example 3: Basic operations and class usage

import Addition.Side;

public final class Basics {

    public static void main(String[] args) {
        // Variables
        int firstNum = 17, secondNum = 17, result;

        // Addition
        result = firstNum + secondNum;
        System.out.println("Addition result: " + result);

        // Using a Calculator object
        Calculator calculator = new Calculator();
        calculator.add(41, 58);
        calculator.sub(82, 35);

        // Using a class from the Addition package
        Side pack = new Side();
        int id = pack.id;
        String name = pack.name;
    }
}

class Calculator {

    void add(int num1, int num2) {
        System.out.println("Sum: " + (num1 + num2));
    }

    final void sub(int num1, int num2) {
        System.out.println("Difference: " + (num1 - num2));
    }
}
