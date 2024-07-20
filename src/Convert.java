// Example 4: Using JOptionPane for input and converting strings to integers

import javax.swing.JOptionPane;

public class Convert {

    public static void main(String[] args) {
        String num1 = JOptionPane.showInputDialog("Enter first number");
        String num2 = JOptionPane.showInputDialog("Enter second number");

        int result = Integer.parseInt(num1) + Integer.parseInt(num2);
        System.out.println("Sum: " + result);
    }
}
