package Codeforces.A;
import java.util.*;
public class ShortSubstrings_1367A {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            String ans = "";

            for (int i = 0; i < s.length(); i += 2) {
                ans += s.charAt(i);
            }

            if (s.length() % 2 == 0) {
                ans += s.charAt(s.length() - 1);
            }

            System.out.println(ans);
        }
    }
}
    