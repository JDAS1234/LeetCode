import java.util.Stack;
import java.util.Scanner;

public class ValidParentheses {
    public static void main(String[] args) {

        String s = "{[()]}";
        System.out.println(isBalanced(s)); // true

        s = "{[(])}";
        System.out.println(isBalanced(s)); // false

        s = "{{[[(())]]}}";
        System.out.println(isBalanced(s)); // true

        String input = "";
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter a string of parentheses (type quit to exit): ");
                input = scanner.nextLine();

                if (input.equals("quit")) {
                    break;
                }

                if (input.isEmpty()) {
                    System.out.println("Please enter something.");
                    continue;
                }

                if (isBalanced(input)) {
                    System.out.println("The parentheses are balanced.");
                } else {
                    System.out.println("The parentheses are not balanced.");
                }
            }
        }

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
