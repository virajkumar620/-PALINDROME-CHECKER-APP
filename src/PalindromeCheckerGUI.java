import javax.swing.*;
import java.awt.*;

public class PalindromeCheckerGUI {

    // Basic palindrome
    public static boolean basic(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    // Ignore case
    public static boolean ignoreCase(String s) {
        return s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
    }

    // Advanced check
    public static boolean advanced(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Palindrome Checker");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Enter Text:");
        JTextField inputField = new JTextField(20);

        String[] modes = {
                "Basic Check",
                "Ignore Case",
                "Ignore Case + Symbols"
        };

        JComboBox<String> modeBox = new JComboBox<>(modes);

        JButton checkBtn = new JButton("Check");

        JLabel result = new JLabel("Result: ");

        // Button Action
        checkBtn.addActionListener(e -> {
            String text = inputField.getText();
            int choice = modeBox.getSelectedIndex();
            boolean isPalindrome = false;

            switch (choice) {
                case 0:
                    isPalindrome = basic(text);
                    break;
                case 1:
                    isPalindrome = ignoreCase(text);
                    break;
                case 2:
                    isPalindrome = advanced(text);
                    break;
            }

            if (isPalindrome)
                result.setText("Result: ✔ Palindrome");
            else
                result.setText("Result: ✘ Not Palindrome");
        });

        frame.add(label);
        frame.add(inputField);
        frame.add(modeBox);
        frame.add(checkBtn);
        frame.add(result);

        frame.setVisible(true);
    }
}
