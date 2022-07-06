package bronze.bronze5;

import java.util.Scanner;

public class Bronze5_1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        sc.nextLine();
        sc.close();

        if (a > b) {
            System.out.println(">");
        }

        if (a < b) {
            System.out.println("<");
        }

        if (a == b) {
            System.out.println("==");
        }
    }
}
