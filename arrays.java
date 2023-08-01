import java.util.Arrays;
import java.util.stream.IntStream;

public class arrays {
    public static void main(String[] args) {
        // Declaration and Initialization
        int[] intArray = new int[5]; // Declares an integer array of size 5
        int[] initializedArray = { 1, 2, 3, 4, 5 }; // Initializes an integer array with values

        // Accessing Array Elements
        int firstElement = intArray[0]; // Accesses the element at index 0
        int lastElement = initializedArray[initializedArray.length - 1]; // Accesses the last element

        // Array Length
        int arrayLength = intArray.length; // Gets the length of the array

        // Array Copy
        int[] copyArray = Arrays.copyOf(initializedArray, initializedArray.length); // Copies the array

        // Array Comparison
        boolean areArraysEqual = Arrays.equals(intArray, copyArray); // Checks if two arrays are equal

        // Sorting Arrays
        Arrays.sort(initializedArray); // Sorts the array in ascending order

        // Searching Arrays
        int searchElement = 3;
        int index = Arrays.binarySearch(initializedArray, searchElement); // Searches for an element and returns its
                                                                          // index

        // Multi-dimensional Arrays
        int[][] multiDimensionalArray = new int[3][3]; // Declares a 2D array of size 3x3
        int[][] initialized2DArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; // Initializes a 2D array

        // Jagged Arrays (Arrays of Arrays)
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[] { 1, 2 };
        jaggedArray[1] = new int[] { 3, 4, 5 };
        jaggedArray[2] = new int[] { 6 };

        // Array to String
        String arrayToString = Arrays.toString(initializedArray); // Converts the array to a String representation

        // Array Fill
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 42); // Fills the array with the value 42

        // Array Equals (Deep Comparison for Multi-dimensional Arrays)
        int[][] array1 = { { 1, 2 }, { 3, 4 } };
        int[][] array2 = { { 1, 2 }, { 3, 4 } };
        boolean areMultiDimArraysEqual = Arrays.deepEquals(array1, array2); // Checks if multi-dimensional arrays are
                                                                            // equal

        // Array Stream
        int[] array = { 1, 2, 3, 4, 5 };
        IntStream stream = Arrays.stream(array); // Creates an IntStream from an array

        // Array Operations using Stream API
        int sum = Arrays.stream(array).sum(); // Calculates the sum of array elements
        int max = Arrays.stream(array).max().orElse(0); // Finds the maximum value in the array
        int min = Arrays.stream(array).min().orElse(0); // Finds the minimum value in the array
        double average = Arrays.stream(array).average().orElse(0.0); // Calculates the average of array elements
        int count = (int) Arrays.stream(array).count(); // Counts the number of elements in the array

    }

}
