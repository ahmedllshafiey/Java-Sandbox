// Example 9: String manipulation using JOptionPane

import javax.swing.JOptionPane;

public class Strings {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Please enter your name");

        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("First character: " + name.charAt(0));
        System.out.println("Index of 'hm': " + name.indexOf("hm"));
        System.out.println("Contains 'med': " + name.contains("med"));
        System.out.println("Substring (1, 4): " + name.substring(1, 4));
        System.out.println("Is empty: " + name.isEmpty());
        System.out.println("Replace 'med' with 'say': " + name.replace("med", "say"));
    }
}
