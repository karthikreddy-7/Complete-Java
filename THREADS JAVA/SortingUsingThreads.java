import java.util.Scanner;

public class SortingUsingThreads {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sorting sort = new sorting(arr);
        ascendingthread ascending = new ascendingthread(sort);
        descendingthread descending = new descendingthread(sort);
        ascending.start();
        descending.start();
        sc.close();
    }
}

class sorting {
    private final int[] arr;

    public sorting(int[] array) {
        this.arr = array;
    }

    public synchronized void ascending() {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (!swapped) {
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public synchronized void descending() {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (!swapped) {
                break;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class ascendingthread extends Thread {
    private final sorting sort;

    public ascendingthread(sorting sorting) {
        this.sort = sorting;
    }

    public void run() {
        sort.ascending();
    }
}

class descendingthread extends Thread {
    private final sorting sort;

    public descendingthread(sorting sort) {
        this.sort = sort;
    }

    public void run() {
        sort.descending();
    }
}