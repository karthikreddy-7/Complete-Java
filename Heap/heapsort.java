package Heap;

import java.util.Scanner;

public class heapsort {
    // Heap sort whose time complexity is O(nlog(n))
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n + 1]; // Start the array from index 1
        System.out.println("Enter the array elements:");
        for (int i = 1; i <= n; i++) { // Start from index 1
            arr[i] = sc.nextInt();
        }
        // Converting the array into max heap:
        for (int i = n / 2; i > 0; i--) {
            heapify(arr, n, i);
        }
        // Deleting the top element and again converting into max heap with length--
        // every time:
        heapsort1(arr);
        // Displaying elements:
        System.out.println();
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i;
        int r = 2 * i + 1;
        if (l <= n && arr[l] > arr[largest]) {
            largest = l;
        }
        if (r <= n && arr[r] > arr[largest]) {
            largest = r;
        }
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }
    }

    public static void heapsort1(int[] arr) {
        int n = arr.length - 1;
        for (int i = n; i > 1; i--) { // Loop until index 1
            int temp = arr[i];
            arr[i] = arr[1];
            arr[1] = temp;
            heapify(arr, i - 1, 1); // Reduce heap size by 1
        }
    }

}
