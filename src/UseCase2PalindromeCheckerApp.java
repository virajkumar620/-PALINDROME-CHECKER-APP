public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string
        String word = "madam";

        // Reverse the string
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        // Display app header
        System.out.println("==================================");
        System.out.println("      Palindrome Checker App");
        System.out.println("==================================");
        System.out.println("UC2: Print a Hardcoded Palindrome Result");
        System.out.println();

        // Check palindrome condition
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("==================================");
        System.out.println("Program finished.");
    }
}
