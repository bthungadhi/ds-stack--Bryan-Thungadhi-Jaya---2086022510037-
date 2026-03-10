import java.util.*;

public class soal5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        int x = n;
        while (x >= 1) {
            stack.push(x);
            x = x / 2;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
            if (!stack.isEmpty()) sb.append(" ");
        }

        System.out.println(sb.toString());
    }
}