import java.util.Scanner;

public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Header
        System.out.println("==================================");
        System.out.println("      Palindrome Checker App");
        System.out.println("==================================");
        System.out.println("UC4: Character Array Based Palindrome Check");
        System.out.println();

        // User input
        System.out.print("Enter a word or string: ");
        String input = scanner.nextLine();

        // Convert string to char array
        char[] characters = input.toCharArray();

        // Two-pointer palindrome check
        int start = 0;
        int end = characters.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Output result
        if (isPalindrome) {
            System.out.println("Result: \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a Palindrome.");
        }

        System.out.println("==================================");
        System.out.println("Program finished.");

        scanner.close();
    }
}
