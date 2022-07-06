package bronze.bronze5;

import java.util.Scanner;

public class Bronze5_2738 { // 런다임 에러
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        int[][] arr1 = new int[a][b];
        int[][] arr2 = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr1[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr2[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        sc.close();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(arr1[i][j] + arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
