public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "A man a plan a canal Panama";

        // Normalize string
        text = text.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;

        int start = 0;
        int end = text.length() - 1;

        // Compare characters
        while(start < end) {

            if(text.charAt(start) != text.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Result
        if(isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}