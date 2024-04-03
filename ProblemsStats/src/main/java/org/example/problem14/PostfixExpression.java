package org.example.problem14;

import java.util.Stack;

public class PostfixExpression {
    public static void main(String[] args) {
        int evaluatePostfixExp = evaluatePostfixExp("231*+9-");
        System.out.println(evaluatePostfixExp);
    }

    public static int evaluatePostfixExp(String exp) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (Character.isDigit(ch)) {
                stack.push(Character.getNumericValue(ch));
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                Integer val1 = stack.pop();
                Integer val2 = stack.pop();
                switch (ch) {
                    case '+':
                        int result = val2 + val1;
                        stack.push(result);
                        break;

                    case '-':
                        int result1 = val2 - val1;
                        stack.push(result1);
                        break;

                    case '*':
                        int result2 = val2 * val1;
                        stack.push(result2);
                        break;

                    case '/':
                        int result3 = val2 / val1;
                        stack.push(result3);
                        break;
                }
            }

        }
        return stack.pop();
    }
}
