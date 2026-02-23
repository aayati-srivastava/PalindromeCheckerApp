import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string
        String text = "level";

        // Create Queue and Stack
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Insert characters into both structures
        for(int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            queue.add(ch);   // enqueue
            stack.push(ch);  // push
        }

        boolean isPalindrome = true;

        // Compare dequeue vs pop
        for(int i = 0; i < text.length(); i++) {

            if(queue.remove() != stack.pop()) {
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