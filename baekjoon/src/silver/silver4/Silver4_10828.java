package silver.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Silver4_10828 {
    public static void main(String[] args) throws IOException {
        Stack stack = new Stack();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer inputs = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(inputs.nextToken());

        for (int i = 0; i < n; i++) {
            inputs = new StringTokenizer(br.readLine());
            String keyword = inputs.nextToken();

            if ("push".equals(keyword)) {
                stack.push(inputs.nextToken());
                continue;
            }

            if ("top".equals(keyword)) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                }
                continue;
            }

            if ("size".equals(keyword)) {
                System.out.println(stack.size());
                continue;
            }

            if ("empty".equals(keyword)) {
                if (stack.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
                continue;
            }

            if ("pop".equals(keyword)) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.pop());
                }
                continue;
            }
        }
    }
}
