package bronze.bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 7/24 : 18분 31초
public class Bronze5_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer inputs;

        TreeSet ts = new TreeSet();

        for (int i = 0; i < 30; i++) {
            ts.add(i + 1);
        }

        for (int i = 0; i < 28; i++) {
            inputs = new StringTokenizer(br.readLine());
            ts.remove(Integer.parseInt(inputs.nextToken()));
        }

        for (Object num : ts) {
            System.out.println(num);
        }
    }
}
