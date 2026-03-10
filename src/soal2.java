import java.util.Stack;

public class soal2 {
    public static int evaluateRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") ||
                token.equals("*") || token.equals("/")) {

                int b = stack.pop();
                int a = stack.pop();

                switch (token) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break;
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String[] tokens1 = {"2", "1", "+", "3", "*"};
        System.out.println("Test 1: " + evaluateRPN(tokens1));

        String[] tokens2 = {"4", "13", "5", "/", "+"};
        System.out.println("Test 2: " + evaluateRPN(tokens2));

        String[] tokens3 = {"10", "3", "/"};
        System.out.println("Test 3: " + evaluateRPN(tokens3));
    }
}