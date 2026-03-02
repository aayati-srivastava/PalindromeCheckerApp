public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "A man a plan a canal Panama";

        // Normalize string
        text = text.replaceAll("\\s+", "").toLowerCase();


        // ---------- Algorithm 1 : Two Pointer ----------
        long start1 = System.nanoTime();

        boolean result1 = true;
        int left = 0;
        int right = text.length() - 1;

        while(left < right) {
            if(text.charAt(left) != text.charAt(right)) {
                result1 = false;
                break;
            }
            left++;
            right--;
        }

        long end1 = System.nanoTime();


        // ---------- Algorithm 2 : Reverse String ----------
        long start2 = System.nanoTime();

        String reversed = "";
        for(int i = text.length() - 1; i >= 0; i--)
            reversed += text.charAt(i);

        boolean result2 = text.equals(reversed);

        long end2 = System.nanoTime();


        // ---------- Algorithm 3 : Stack ----------
        long start3 = System.nanoTime();

        java.util.Stack<Character> stack = new java.util.Stack<>();

        for(char c : text.toCharArray())
            stack.push(c);

        boolean result3 = true;

        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) != stack.pop()) {
                result3 = false;
                break;
            }
        }

        long end3 = System.nanoTime();


        // ---------- Results ----------
        System.out.println("Two Pointer Result: " + result1 + " Time: " + (end1-start1));
        System.out.println("Reverse String Result: " + result2 + " Time: " + (end2-start2));
        System.out.println("Stack Result: " + result3 + " Time: " + (end3-start3));
    }
}