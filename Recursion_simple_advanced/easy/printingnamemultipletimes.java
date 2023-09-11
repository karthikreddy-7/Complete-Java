package Recursion_simple_advanced.easy;

import java.util.Scanner;

//printing name number of times using recursion:
public class printingnamemultipletimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of times you want to print:");
        int n = sc.nextInt();
        System.out.println("enter the name you want to print:");
        String s = sc.next();
        System.out.println();
        print(s, n);
        sc.close();
    }

    static void print(String s, int n) {
        if (n == 0) {
            return;
        }
        System.out.println(s);
        print(s, n - 1);
    }
}
