package Mathematical_tricks;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Sieve of Eratosthenes is a method in which we can find the number of prime numbers from the range 1 to N.
 * it uses sieve method to purify the non prime numbers and keep the prime numbers.
 */
public class Sieve_of_Eratosthenes {
    public static void main(String[] args) {
        System.out.println("enter the range of N:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean[] a = isprime(x);
        for (int i = 0; i < a.length; i++) {
            if (a[i] == true) {
                System.out.println(i + " is a prime number.");
            } else {
                System.out.println(i + " is not a prime number");
            }
        }
        sc.close();
    }

    static boolean[] isprime(int n) {
        boolean[] isprime = new boolean[n + 1];
        Arrays.fill(isprime, true);
        isprime[0] = false;
        isprime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            for (int j = 2 * i; j <= n; j = j + i) {
                isprime[j] = false;
            }
        }
        return isprime;

    }

}
