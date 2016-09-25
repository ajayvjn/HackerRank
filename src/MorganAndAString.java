import java.util.Scanner;

/**
 * Created by Ajay on 01-Sep-16.
 * https://www.hackerrank.com/challenges/morgan-and-a-string
 */
public class MorganAndAString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        String a;
        String b;
        String shortStr = "";
        String longStr = "";
        int k = 0;
        String output = "";

        for (int i = 0; i < count; i++) {
            a = scanner.next();
            b = scanner.next();

            shortStr = a.length() < b.length() ? a : b;
            longStr = a.length() < b.length() ? b : a;
            k = 0;
            output = "";

            for (int j = 0; j < shortStr.length(); j++) {
                if (k < shortStr.length()) {
                    if (shortStr.charAt(j) <= longStr.charAt(k)) {
                        output += shortStr.charAt(j);
                    } else {
                        output += longStr.charAt(k);
                        k++;
                        j--;
                    }
                }
            }

            output += longStr.substring(k, longStr.length());
            System.out.println(output);
        }

    }
}
