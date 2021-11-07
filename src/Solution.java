public class Solution {
    public boolean isValid(String s) {
        //This solution does not work. See solution 2.
        int[] chars = {0, 0, 0, 0, 0, 0};

        char current;
        for (int i = 0; i < s.length(); i++) {
            current = s.charAt(i);

            if (current == '(') {
                chars[0]++;
            } else if (current == ')') {
                chars[1]++;
            } else if (current == '{') {
                chars[2]++;
            } else if (current == '}') {
                chars[3]++;
            } else if (current == '[') {
                chars[4]++;
            } else if (current == ']') {
                chars[5]++;
            }
        }

        return chars[0] == chars[1] && chars[2] == chars[3] && chars[4] == chars[5];
    }
}
