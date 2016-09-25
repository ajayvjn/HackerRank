import java.util.Scanner;

/**
 * Created by Ajay on 25-Sep-16.
 * https://www.hackerrank.com/challenges/kangaroo
 */
public class Kangaroo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();

        if ((x1 > x2 && v1 > v2) || (x1 < x2 && v1 < v2) || (x1 != x2 && v1 == v2)) {
            System.out.println("NO");
            System.exit(0);
        }

        int d = 0;
        boolean o = true;
        while (d >= 0) {
            if (x1 < x2)
                o = true;
            x1 += v1;
            x2 += v2;
            d = o ? x2 - x1 : x1 - x2;

            if (d < 0) {
                System.out.println("NO");
                break;
            } else if (d == 0) {
                System.out.println("YES");
                break;
            }
        }
    }
}
