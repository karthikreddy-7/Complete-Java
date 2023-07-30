package Searching;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + " value of the array");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target value:");
        int key = sc.nextInt();
        int value = binarysearch(arr, n, key);
        if (value == -1) {
            System.out.println("Target value Not Found in the array");
        } else {
            System.out.println("Target value found at index " + value + " in the array");
        }
        sc.close();
    }

    public static int binarysearch(int[] arr, int n, int key) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;

    }
}