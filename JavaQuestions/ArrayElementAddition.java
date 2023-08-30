package JavaQuestions;

import java.util.Scanner;

public class ArrayElementAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        addValueToElements(array, k);

        System.out.println("Array after adding " + k + " to each element:");
        for (int element : array) {
            System.out.print(element + " ");
        }

        scanner.close();
    }

    public static void addValueToElements(int[] array, int k) {
        for (int i = 0; i < array.length; i++) {
            array[i] += k;
        }
    }

}
