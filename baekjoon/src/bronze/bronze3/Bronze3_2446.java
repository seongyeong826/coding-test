package bronze.bronze3;

import java.util.Scanner;

public class Bronze3_2446 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int temp = 1;
        int left = 0;

        if (n == 1) {
            System.out.println("*");
        }

        if (n != 1) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < left; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < (2 * n) - temp; k++) {
                    if ((2 * n) - temp == 1) {
                        break;
                    }
                    System.out.print("*");
                }

                left++;
                temp+=2;
                System.out.println();
                if ((2 * n) - temp == 1) {
                    break;
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < left; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < (2 * n) - temp; k++) {
                    System.out.print("*");
                }

                left--;
                temp-=2;
                System.out.println();
            }
        }
    }
}
