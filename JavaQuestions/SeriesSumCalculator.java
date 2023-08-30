package JavaQuestions;

import java.util.Scanner;

public class SeriesSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        double x = scanner.nextDouble();

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        double sum = calculateSeriesSum(x, n);

        System.out.println("Sum of the series: " + sum);

        scanner.close();
    }

    public static double calculateSeriesSum(double x, int n) {
        double sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += Math.pow(x, i);
        }
        return sum;
    }
}
