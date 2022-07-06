package bronze.bronze5;

import java.util.Scanner;

public class Bronze5_1271 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();
        sc.close();

        System.out.println(n / m);
        System.out.println(n % m);
    }
}
