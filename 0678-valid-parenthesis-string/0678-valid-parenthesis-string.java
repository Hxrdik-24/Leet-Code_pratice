import java.util.Stack;

class Solution {
    public boolean checkValidString(String s) {

        Stack<Integer> openStack = new Stack<>();
        Stack<Integer> starStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == '(') {

                openStack.push(i);

            } 
            else if (c == '*') {

                starStack.push(i);

            } 
            else if (c == ')') {

                // First use '('
                if (!openStack.isEmpty()) {

                    openStack.pop();

                }
                // If '(' is not available, use '*' as '('
                else if (!starStack.isEmpty()) {

                    starStack.pop();

                }
                // Neither '(' nor '*' available
                else {

                    return false;
                }
            }
        }

        // Match remaining '(' with '*' after them
        while (!openStack.isEmpty() && !starStack.isEmpty()) {

            int openIndex = openStack.pop();
            int starIndex = starStack.pop();

            // '*' must come after '('
            if (starIndex < openIndex) {

                return false;
            }
        }

        // If '(' are still left, they cannot be matched
        return openStack.isEmpty();
    }
}