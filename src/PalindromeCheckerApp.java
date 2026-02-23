public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker App");

        // Run UC1
        UseCase1.run();

        // Run UC2
        UseCase2.run();
    }
}

// ---------------- UC1 ----------------
class UseCase1 {
    public static void run() {
        System.out.println("=======================================");
        System.out.println("      PALINDROME CHECKER APP");
        System.out.println("=======================================");
        System.out.println("Version : 1.0");
        System.out.println("Author  : Aayati Srivastava");
        System.out.println("---------------------------------------");
        System.out.println("Welcome to the Palindrome Checker Application!");
        System.out.println("=======================================");
    }
}

// ---------------- UC2 ----------------
class UseCase2 {
    public static void run() {
        String word = "madam";  // hardcoded string
        String result;

        // Check palindrome
        if (word.equals(new StringBuilder(word).reverse().toString())) {
            result = word + " is a palindrome";
        } else {
            result = word + " is not a palindrome";
        }

        System.out.println("=======================================");
        System.out.println("      HARDCODED PALINDROME CHECK");
        System.out.println("=======================================");
        System.out.println("Word: " + word);
        System.out.println("Result: " + result);
        System.out.println("=======================================");
    }
}