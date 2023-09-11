package Recursion_simple_advanced.easy;

import java.util.Scanner;

public class factorialN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of N:");
        int n = sc.nextInt();
        factorialparamter(n, 1);
        int res = factorialfunc(n);
        System.out.println("the product of N by functional recursion is " + res);
        sc.close();
    }

    static void factorialparamter(int n, int product) {
        if (n < 1) {
            System.out.println("the product of N by paratermized recursion is " + product);
            return;
        }
        factorialparamter(n - 1, n * product);
    }

    static int factorialfunc(int n) {
        if (n < 1) {
            return 1;
        }
        return n * factorialfunc(n - 1);

    }

}
