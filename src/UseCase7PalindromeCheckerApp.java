import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

public class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Header
        System.out.println("==================================");
        System.out.println("      Palindrome Checker App");
        System.out.println("==================================");
        System.out.println("UC7: Deque-Based Optimized Palindrome Checker");
        System.out.println();

        // User input
        System.out.print("Enter a word or string: ");
        String input = scanner.nextLine();

        // Create deque
        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        // Compare front and rear
        boolean isPalindrome = true;

        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
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
