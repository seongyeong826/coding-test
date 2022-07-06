package bronze.bronze2;

import java.util.Scanner;

public class Bronze2_1100 {
    public static void main(String[] args) { // 런타임 에러
        Scanner sc = new Scanner(System.in);

        int white = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                String s = sc.next();
                if ((i + j) % 2 == 0 && s.equals("F")) {
                    white++;
                }
            }
            sc.nextLine();
        }
        System.out.println(white);
    }
}
