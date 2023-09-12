package Recursion_simple_advanced.medium;

import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array:");
        int n = sc.nextInt();
        System.out.println("enter the elements of array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr, 0, n - 1);
        System.out.println("the reversed array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    static void reverse(int[] arr, int l, int r) {
        if (l > r) {
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverse(arr, l + 1, r - 1);
    }

}
