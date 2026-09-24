package Codeforces.A;
import java.util.*;
public class HelpfulMaths_399A {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int one = 0, two = 0, three = 0;

        // Count 1s, 2s and 3s
        for (char ch : s.toCharArray()) {
            if (ch == '1')
                one++;
            else if (ch == '2')
                two++;
            else if (ch == '3')
                three++;
        }

        StringBuilder ans = new StringBuilder();

        // Add 1s
        for (int i = 0; i < one; i++) {
            if (ans.length() > 0) ans.append("+");
            ans.append("1");
        }

        // Add 2s
        for (int i = 0; i < two; i++) {
            if (ans.length() > 0) ans.append("+");
            ans.append("2");
        }

        // Add 3s
        for (int i = 0; i < three; i++) {
            if (ans.length() > 0) ans.append("+");
            ans.append("3");
        }

        System.out.println(ans);
    }
}
