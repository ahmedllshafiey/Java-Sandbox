// Example 11: Using wrapper classes and exception handling

import javax.swing.JOptionPane;

public class Wrapper {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Please enter your name");
        String age = JOptionPane.showInputDialog("Please enter your age");

        Integer x = 10;
        String stringX = x.toString();

        System.out.println("Is 'A' a letter? " + Character.isLetter('A'));

        // Exception handling
        try {
            int intAge = Integer.parseInt(age);
            float floatAge = Float.parseFloat(age);
            System.out.println("The result is: " + (x + intAge));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Goodbye!!!");
        }
    }
}
