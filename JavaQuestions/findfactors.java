package JavaQuestions;

import java.util.Scanner;

public class findfactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Factors of " + number + ":");
        findFactors(number);

        scanner.close();
    }

    public static void findFactors(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

}
