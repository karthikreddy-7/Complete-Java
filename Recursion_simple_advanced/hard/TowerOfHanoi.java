package Recursion_simple_advanced.hard;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of disks:");
        int n = sc.nextInt();
        tower(n, 'A', 'C', 'B');
        sc.close();
    }

    static void tower(int n, char from, char to, char aux) {
        if (n == 0) {
            return;
        }
        tower(n - 1, from, aux, to);
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        tower(n - 1, aux, to, from);
    }

}
