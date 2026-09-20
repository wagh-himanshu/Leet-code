import java.util.Stack;

class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        // Push -1 as the initial boundary marker
        stack.push(-1); 
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                // Store the index of the opening parenthesis
                stack.push(i); 
            } else {
                // Pop the last matching boundary or opening parenthesis
                stack.pop(); 
                
                if (stack.isEmpty()) {
                    // If empty, the current index becomes the new boundary base
                    stack.push(i); 
                } else {
                    // Calculate length based on the current valid chunk's boundary
                    maxLen = Math.max(maxLen, i - stack.peek());
                }
            }
        }
        return maxLen;
    }
}
