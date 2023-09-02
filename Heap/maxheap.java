package Heap;

import java.util.Scanner;

public class maxheap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        // as the leafnode elements will be satisfying maxheap conditions
        // let's start working from the last non-leaf node i.e. n/2 index.
        for (int i = n / 2; i > 0; i--) {
            heapify(arr, n, i);
        }
        // printing the maxheap array
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
        } else if (r <= n && arr[r] > arr[largest]) {
            largest = r;
        }
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }

    }

}
