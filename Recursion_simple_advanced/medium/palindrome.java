package Recursion_simple_advanced.medium;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String s = sc.nextLine();
        boolean check = check(s, 0, s.length() - 1);
        if (check) {
            System.out.println("yes ! it is palindrome.");
        } else {
            System.out.println("No ! it is not a palindrome");
        }
    }

    static boolean check(String s, int i, int n) {
        if (i > n / 2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(n - i)) {
            return false;
        }
        return check(s, i + 1, n);
    }

}
