package JavaQuestions;

import java.util.Scanner;

public class CharacterOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the character to count: ");
        char targetCharacter = scanner.next().charAt(0);

        int occurrences = countOccurrences(inputString, targetCharacter);

        System.out.println("The character '" + targetCharacter + "' appears " + occurrences + " times in the string.");

        scanner.close();
    }

    public static int countOccurrences(String str, char target) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == target) {
                count++;
            }
        }
        return count;
    }
}
