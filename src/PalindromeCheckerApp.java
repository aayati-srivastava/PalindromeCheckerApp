import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string
        String text = "racecar";

        // Create Deque
        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters
        for(int i = 0; i < text.length(); i++) {
            deque.addLast(text.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear
        while(deque.size() > 1) {

            char front = deque.removeFirst();
            char rear  = deque.removeLast();

            if(front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Result
        if(isPalindrome)
            System.out.println(text + " is a Palindrome");
        else
            System.out.println(text + " is NOT a Palindrome");
    }
}