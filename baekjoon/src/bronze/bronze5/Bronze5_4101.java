package bronze.bronze5;

import java.util.ArrayList;
import java.util.Scanner;

public class Bronze5_4101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2;

        ArrayList list = new ArrayList();

        while (true) {
            num1 = sc.nextInt();
            num2 = sc.nextInt();

            if (num1 == 0 && num2 == 0) {
                break;
            }

            if (num1 > num2) {
                list.add("Yes");
            } else {
                list.add("No");
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
