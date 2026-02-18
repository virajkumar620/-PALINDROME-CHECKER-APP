public class UseCase1PalindromeCheckerApp {

    // Application constants
    static final String APP_NAME = "Palindrome Checker App";
    static final String VERSION = "Version 1.0";
    static final String USE_CASE = "UC1: Application Entry & Welcome Message";

    // Main method – entry point of Java application
    public static void main(String[] args) {

        // Display welcome message and application details
        System.out.println("==================================");
        System.out.println("      " + APP_NAME);
        System.out.println("      " + VERSION);
        System.out.println("==================================");
        System.out.println(USE_CASE);
        System.out.println("Welcome! This application checks whether a string is a palindrome.");
        System.out.println("Program started successfully.");
        System.out.println("==================================");

        // Program can continue to next use case
        System.out.println("Ready to proceed to next use case...");
    }
}
