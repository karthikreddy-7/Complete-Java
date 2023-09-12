package Recursion_simple_advanced.medium;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Nth value:");
        int n = sc.nextInt();
        int res = fib(n);
        System.out.println("the value of Nth Fibonacci series is " + res);
    }

    static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

}
