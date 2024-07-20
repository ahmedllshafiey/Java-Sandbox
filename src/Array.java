// Example 2: Working with arrays

public class Array {

    public static void main(String[] args) {
        // Array with known values
        int[] knownValues = {10, 55, 15, 56, 147, 1432, 147};

        // Printing each element in the knownValues array
        for (int i = 0; i < knownValues.length; i++) {
            System.out.println("Known value: " + knownValues[i]);
        }

        // Array with unknown values
        int[] unknownValues = new int[7];
        for (int i = 0; i < unknownValues.length; i++) {
            unknownValues[i] = i;
            System.out.println("Unknown value: " + unknownValues[i]);
        }
    }
}
