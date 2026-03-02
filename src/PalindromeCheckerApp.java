public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "madam";

        // choose strategy
        String strategy = "STACK";   // change to DEQUE to switch logic

        boolean isPalindrome = true;

        if(strategy.equals("STACK")) {

            java.util.Stack<Character> stack = new java.util.Stack<>();

            for(char c : text.toCharArray())
                stack.push(c);

            for(int i = 0; i < text.length(); i++) {
                if(text.charAt(i) != stack.pop()) {
                    isPalindrome = false;
                    break;
                }
            }
        }

        else {

            java.util.Deque<Character> deque = new java.util.ArrayDeque<>();

            for(char c : text.toCharArray())
                deque.addLast(c);

            while(deque.size() > 1) {

                if(deque.removeFirst() != deque.removeLast()) {
                    isPalindrome = false;
                    break;
                }
            }
        }

        // Result
        if(isPalindrome)
            System.out.println("Palindrome using " + strategy + " strategy");
        else
            System.out.println("Not a Palindrome using " + strategy + " strategy");
    }
}