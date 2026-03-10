//nomor 1
import java.util.Stack;

public class soal1 {
    public static boolean isBalance(String ekspresi) {
        Stack<Character> stack = new Stack<>();

        for (char c : ekspresi.toCharArray()) {

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }

            else if (c == ')' || c == '}' || c == ']') {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String ekspresi = "{[()]}";

        if (isBalance(ekspresi)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}