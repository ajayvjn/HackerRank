import java.util.Scanner;

/**
 * Created by Ajay on 15-Sep-16.
 * https://www.hackerrank.com/contests/w23/challenges/gears-of-war
 */
public class GearsOfWar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();

        while (i-- > 0) {
            if (in.nextInt() / 2 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}