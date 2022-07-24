package bronze.bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 7/24 : 3분 9초
public class Bronze5_5522 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer inputs;

        int a = 0;
        for (int i = 0; i < 5; i++) {
            inputs = new StringTokenizer(br.readLine());
            a += Integer.parseInt(inputs.nextToken());
        }

        System.out.println(a);
    }
}
