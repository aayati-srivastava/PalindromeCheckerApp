public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string
        String text = "radar";

        // Convert string to char array
        char[] arr = text.toCharArray();

        // Two pointer variables
        int start = 0;
        int end = arr.length - 1;

        boolean isPalindrome = true;

        // Two-pointer comparison
        while(start < end) {

            if(arr[start] != arr[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Result
        if(isPalindrome)
            System.out.println(text + " is a Palindrome");
        else
            System.out.println(text + " is NOT a Palindrome");
    }
}