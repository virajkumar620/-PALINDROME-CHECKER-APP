import java.util.Scanner;

public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Display header
        System.out.println("==================================");
        System.out.println("      Palindrome Checker App");
        System.out.println("==================================");
        System.out.println("UC3: Palindrome Check Using String Reverse");
        System.out.println();

        // Take input from user
        System.out.print("Enter a word or string: ");
        String original = scanner.nextLine();

        // Reverse string using loop
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        // Compare original and reversed
        if (original.equals(reversed)) {
            System.out.println("Result: \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("Result: \"" + original + "\" is NOT a Palindrome.");
        }

        System.out.println("==================================");
        System.out.println("Program finished.");

        scanner.close();
    }
}
