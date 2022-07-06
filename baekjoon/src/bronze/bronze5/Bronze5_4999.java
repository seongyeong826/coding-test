package bronze.bronze5;

import java.util.Scanner;

public class Bronze5_4999 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String j = sc.nextLine();
        String d = sc.nextLine();

        if (j.length() >= d.length()) {
            System.out.print("go");
        } else {
            System.out.print("no");
        }
    }
}
