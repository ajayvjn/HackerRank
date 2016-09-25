/**
 * Created by Ajay on 24-Sep-16.
 * https://www.hackerrank.com/challenges/halloween-party
 */
public class HalloweenParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        long[] k = new long[count];
        long o;

        for (int i = 0; i < count; i++) {
            k[i] = scanner.nextInt();
        }

        for (int i = 0; i < count; i++) {
            if (k[i] % 2 == 0)
                System.out.println(k[i] / 2 * k[i] / 2);
            else {
                o = k[i] / 2;
                System.out.println(o * (k[i] - o));
            }
        }
        scanner.close();
    }
}
