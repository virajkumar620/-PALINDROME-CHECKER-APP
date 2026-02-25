import java.util.*;

// 1️⃣ Strategy Interface
interface PalindromeStrategy {
    boolean check(String input);
}

// 2️⃣ Stack-Based Strategy
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : input.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

// 3️⃣ Deque-Based Strategy
class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {
        Deque<Character> deque = new LinkedList<>();

        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}

// 4️⃣ Context Class
class PalindromeContext {

    private PalindromeStrategy strategy;

    public PalindromeContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(String input) {
        return strategy.check(input);
    }
}

// 5️⃣ Main Application
public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===============================================");
        System.out.println("          Palindrome Checker App");
        System.out.println("===============================================");
        System.out.println("UC12: Strategy Pattern for Palindrome Algorithms");
        System.out.println();

        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        System.out.println("\nChoose Strategy:");
        System.out.println("1. Stack-Based Strategy");
        System.out.println("2. Deque-Based Strategy");
        System.out.print("Enter choice (1 or 2): ");

        int choice = scanner.nextInt();

        PalindromeStrategy strategy;

        if (choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        PalindromeContext context = new PalindromeContext(strategy);

        boolean result = context.executeStrategy(input);

        if (result) {
            System.out.println("\nResult: \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("\nResult: \"" + input + "\" is NOT a Palindrome.");
        }

        System.out.println("===============================================");
        System.out.println("Program finished.");

        scanner.close();
    }
}