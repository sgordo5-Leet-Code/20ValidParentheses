import java.util.Stack;

public class Solution3 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                stack.add(s.charAt(i));
            }
            else {
                if (stack.isEmpty()) {
                    return false;
                }
                Character c = stack.pop();
                if ((s.charAt(i) == '}' && c != '{') || (s.charAt(i) == ')' && c != '(') || (s.charAt(i) == ']' && c != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
