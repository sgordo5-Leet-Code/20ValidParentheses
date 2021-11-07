public class Solution2 {
    public boolean isValid(String s) {
        return complete(s, true, 0, ' ');
    }

    private boolean complete(String s, boolean bool, int index, char want) {
        if (s.charAt(index) == '(') {
            return complete(s, true, index + 1, ')');
        } else if (s.charAt(index) == '{') {
            return complete(s, true, index + 1, '}');
        } else if (s.charAt(index) == '[') {
            return complete(s, true, index + 1, ']');
        } else if (want == s.charAt(index)) {
            if (index < s.length() - 1) {
                complete(s, true, index + 1, ' ');
            }
            return true;
        } else {
            return false;
        }
    }
}
