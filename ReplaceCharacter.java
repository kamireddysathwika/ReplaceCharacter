public class ReplaceCharacter {
    public static void main(String[] args) {
        // Predefined input string
        String input = "Hello, World!";
        
        // Characters to replace and their replacement
        char oldChar = 'o';
        char newChar = 'a';
        
        // Replace the character in the string
        String replacedString = replaceCharacter(input,oldChar, newChar);
        
        // Print the original and modified strings
        System.out.println("Original string: " + input);
        System.out.println("Modified string: " + replacedString);
    }
    public static String replaceCharacter(String str, char oldChar, char newChar) {
        // Use the replace() method of the String class
        return str.replace(oldChar, newChar);
    }
}

