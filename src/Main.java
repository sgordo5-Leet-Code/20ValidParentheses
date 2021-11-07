public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution3 solution = new Solution3();

        System.out.println("() is valid: " + solution.isValid("()"));
        System.out.println("()[]{} is valid: " + solution.isValid("()[]{}"));
        System.out.println("(] is valid: " + solution.isValid("(]"));
        System.out.println("([)] is valid: " + solution.isValid("([)]"));
        System.out.println("{[]} is valid: " + solution.isValid("{[]}"));
        System.out.println("[ is valid: " + solution.isValid("["));
        System.out.println("] is valid: " + solution.isValid("]"));
    }
}
