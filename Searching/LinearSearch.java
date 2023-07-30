package Searching;

import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value of " + (i + 1) + " element in the array:");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target value:");
        int t = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == t) {
                found = true;
                System.out.println("Target value found at " + i + " index of the array.");
            }
        }
        if (!found) {
            System.out.println("target value not found in the array.");
        }
        sc.close();
    }
}
