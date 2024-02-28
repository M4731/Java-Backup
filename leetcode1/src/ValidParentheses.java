import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        char last = '0';
        int index = 0;

        while (index < s.length()) {
            if ((last == '(' && s.charAt(index) == ')') || (last == '[' && s.charAt(index) == ']') || (last == '{' && s.charAt(index) == '}')) {
                stack.pop();
            } else {
                stack.push(s.charAt(index));
            }

            last = stack.isEmpty() ? 0 : stack.peek();
            index++;
        }

        return stack.isEmpty();
    }
}
