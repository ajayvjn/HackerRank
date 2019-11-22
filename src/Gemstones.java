import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Ajay on 01-Sep-16.
 * https://www.hackerrank.com/challenges/gem-stones
 */
public class Gemstones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        Set<Character> list = new HashSet<>();
        String str = scanner.next();

        for(int j=0; j<str.length();j++){
            list.add(str.charAt(j));
        }

        Set<Character> myList = new HashSet<>();

        for(int i = 0; i< count-1; i++){
            myList.clear();
            str = scanner.next();
            for(int j=0; j<str.length();j++){
                myList.add(str.charAt(j));
            }
            list.retainAll(myList);
        }

        System.out.print(list.size());
        scanner.close();
    }
}
