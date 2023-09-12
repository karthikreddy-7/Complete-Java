package Patterns;

import java.util.Scanner;

public class HollowInvertedHalfpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n = sc.nextInt();
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                if (i == n || j == i || j == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                System.out.print(" ");

            }
            System.out.println();
        }
        sc.close();
    }

}
