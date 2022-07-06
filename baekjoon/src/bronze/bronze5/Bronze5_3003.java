package bronze.bronze5;

import java.util.Scanner;

public class Bronze5_3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] chess = new int[] { 1, 1, 2, 2, 2, 8 };
        int[] myChess = new int[chess.length];

        for (int i = 0; i < chess.length; i++) {
            myChess[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < chess.length; i++) {
            System.out.print(chess[i] - myChess[i]);
            System.out.print(" ");
        }
    }
}
