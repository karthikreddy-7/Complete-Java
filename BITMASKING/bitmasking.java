package BITMASKING;

public class bitmasking {
    public static void main(String[] args) {
        int n = 3;
        int count = 0;
        while (n != 0) {
            n = n & n - 1;
            count++;
        }
        System.out.println("the number of one's in the number is " + count);
    }
}