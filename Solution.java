import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = performOperation(operand1, operand2, token);
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private int performOperation(int operand1, int operand2, String op) {
        switch (op) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        String[] tokens1 = {"2", "1", "+", "3", "*"};
        System.out.println(solution.evalRPN(tokens1));  // Output: 9

        // Example 2
        String[] tokens2 = {"4", "13", "5", "/", "+"};
        System.out.println(solution.evalRPN(tokens2));  // Output: 6

        // Example 3
        String[] tokens3 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(solution.evalRPN(tokens3));  // Output: 22
    }
}
