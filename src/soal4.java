import java.util.*;

public class soal4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().trim().split(" ");
        int n = input.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(arr);

        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            stack.push(arr[i]);
        }

        List<Integer> result = new ArrayList<>();
        int round = 1;
        while (!stack.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < round && !stack.isEmpty(); i++) {
                temp.add(stack.pop());
            }
            result.addAll(temp);
            round++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.size(); i++) {
            if (i > 0) sb.append(" ");
            sb.append(result.get(i));
        }
        System.out.println(sb.toString());
    }
}