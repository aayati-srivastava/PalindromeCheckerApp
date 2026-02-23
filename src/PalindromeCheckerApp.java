public class PalindromeCheckerApp {

    // Recursive method
    static boolean isPalindrome(String str, int start, int end) {

        // Base condition
        if(start >= end)
            return true;

        // Check characters
        if(str.charAt(start) != str.charAt(end))
            return false;

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String text = "level";

        if(isPalindrome(text, 0, text.length() - 1))
            System.out.println(text + " is a Palindrome");
        else
            System.out.println(text + " is NOT a Palindrome");
    }
}