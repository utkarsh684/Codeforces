import java.util.*;

public class stack {
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (String token : expression.split(" ")) {
            if (token.matches("-?\\d+")) {
                stack.push(Integer.parseInt(token));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                int result = 0;

                switch (token) {
                    case "+": result = a + b; break;
                    case "-": result = a - b; break;
                    case "*": result = a * b; break;
                    case "/": result = a / b; break;
                    case "^": result = (int)Math.pow(a, b); break;
                    default: throw new IllegalArgumentException("Invalid operator: " + token);
                }
                stack.push(result);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter postfix expression (space separated): ");
        String expr = sc.nextLine();

        int result = evaluatePostfix(expr);
        System.out.println("Result = " + result);

        sc.close();
    }
}

