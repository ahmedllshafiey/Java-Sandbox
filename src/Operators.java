// Example 6: Demonstrating basic type casting and promotion

public class Operators {

    public static void main(String[] args) {
        byte num1 = 10;
        int num2 = 20;

        num2 = num1; // Promotion from byte to int
        num1 = (byte) num2; // Casting from int to byte

        System.out.println("Num2: " + num2);
    }
}
