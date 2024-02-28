import java.util.Stack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class BalancedParenthesesChecker {
    public static boolean isBalance(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char character : expression.toCharArray()) {
            if (character == '(' || character == '{' || character == '[') {
                stack.push(character);
            } else if (character == ')' || character == '}' || character == ']') {
                if (isMatch(stack.pop(), character)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isMatch(char opening, char closing) {
        return  (opening =='(' && closing == ')')||(opening=='{' && closing=='}')|| (opening=='[' && closing==']');
    }
    public static void main(String[] args) {
        String expression1 = "((a + b) * (c - d))"; // Balanced expression
        String expression2 = "{[x + y] - (z * w)}"; // Balanced expression
        String expression3 = "(a + b) * (c - d))";    // Unbalanced expression

        System.out.println("Expression 1 is balanced: " + isBalance(expression1));
        System.out.println("Expression 2 is balanced: " + isBalance(expression2));
        System.out.println("Expression 3 is balanced: " + isBalance(expression3));
    }
}