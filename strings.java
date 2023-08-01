public class strings {
    public static void main(String[] args) {
        // Creating Strings
        String str1 = "Hello"; // Using string literal
        String str2 = new String("World"); // Using the String class constructor

        // String Length
        int length = str1.length(); // Gets the length of the string

        // Concatenation
        String combined = str1 + " " + str2; // Concatenates two strings
        String concatenated = str1.concat(" " + str2); // Another way to concatenate strings

        // Accessing Characters
        char firstChar = str1.charAt(0); // Gets the character at index 0
        char lastChar = str2.charAt(str2.length() - 1); // Gets the last character

        // Substring
        String substring = str1.substring(1, 4); // Gets the substring from index 1 to 3 (exclusive)

        // String Comparison
        boolean isEqual = str1.equals(str2); // Checks if two strings are equal (case-sensitive)
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2); // Checks if two strings are equal (ignore case)

        // String Searching
        int indexOfWorld = str2.indexOf("World"); // Finds the index of the first occurrence of "World"
        int lastIndexOfL = str1.lastIndexOf("l"); // Finds the index of the last occurrence of "l"

        // String Contains
        boolean containsHello = str1.contains("Hello"); // Checks if the string contains "Hello"

        // String Empty or Null
        boolean isEmpty = str1.isEmpty(); // Checks if the string is empty
        boolean isNull = str1 == null; // Checks if the string is null

        // String Trim
        String paddedString = "   Hello   ";
        String trimmedString = paddedString.trim(); // Removes leading and trailing whitespaces

        // String Replace
        String replacedString = str1.replace("l", "L"); // Replaces all occurrences of 'l' with 'L'

        // String Split
        String exampleString = "one,two,three";
        String[] splitStrings = exampleString.split(","); // Splits the string into an array based on the delimiter ','

        // String Case Conversion
        String lowerCaseString = str1.toLowerCase(); // Converts the string to lowercase
        String upperCaseString = str2.toUpperCase(); // Converts the string to uppercase

        // String Formatting
        String formattedString = String.format("Name: %s, Age: %d", "John", 30); // Formats a string using placeholders

        // String Builder (for efficient string concatenation)
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello");
        stringBuilder.append(" World");
        String result = stringBuilder.toString(); // Converts StringBuilder to a String

    }

}
