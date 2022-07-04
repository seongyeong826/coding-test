import java.text.DecimalFormat;
import java.util.Scanner;

public class Bronze5_2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#");

        int a, b, c, d, e;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        sc.nextLine();
        sc.close();

        System.out.println(df.format((Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2) +
                                             Math.pow(d, 2) + Math.pow(e, 2)) % 10));
    }
}
