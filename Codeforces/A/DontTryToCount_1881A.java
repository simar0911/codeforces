package Codeforces.A;
import java.util.*;
public class DontTryToCount_1881A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            String s = sc.next();
            String t = sc.next();

            int operations = 0;

            while (operations <= 25) {

                // Check if t is already a substring of s
                if (s.contains(t)) {
                    System.out.println(operations);
                    break;
                }

                // Double s
                s = s + s;
                operations++;
            }

            // If not found after all operations
            if (!s.contains(t) && operations > 25) {
                System.out.println(-1);
            }
        }

        sc.close();
    }
}
    