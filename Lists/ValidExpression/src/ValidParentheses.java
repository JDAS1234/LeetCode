import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "{[()]}";
        System.out.println(isBalanced(s)); // true

        s = "{[(])}";
        System.out.println(isBalanced(s)); // false

        s = "{{[[(())]]}}";
        System.out.println(isBalanced(s)); // true
    }

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty())
                    return false;
                char top = stack.peek();
                if (!isMatchingPair(top, ch))
                    return false;
                stack.pop(); // removes the top bracket that matched
            }

        }
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

}
