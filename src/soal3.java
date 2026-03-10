import java.util.Scanner;
import java.util.Stack;

public class soal3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int target = values[i];

            stack.push(1);
            result.append("1");

            while (stack.peek() < target) {
                if (stack.size() == 1) {
                    int top = stack.pop();
                    stack.push(top);
                    stack.push(top);
                    result.append("d");
                } else {
                    int a = stack.pop();
                    int b = stack.pop();
                    int merged = a + b;
                    for (int j = 0; j < stack.size(); j++) {
                        stack.set(j, stack.get(j) - 1);
                    }
                    if (merged == 0) {
                        stack.clear();
                    } else {
                        stack.push(merged);
                    }
                    result.append("+");
                }
            }
        }

        System.out.println(result.toString());
    }
}