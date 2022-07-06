package bronze.bronze5;

import java.util.Scanner;

public class Bronze5_2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        String star = "*";
        a = sc.nextInt();
        sc.nextLine();
        sc.close();

        for (int i = 0; i < a; i++) {
            System.out.print(star);
            star+="*";
            System.out.println();
        }
    }
}
