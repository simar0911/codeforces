package Codeforces.A;
import java.util.*;
public class PetyaAndStrings_112A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        String s1 = str1.toLowerCase();
        String s2 = str2.toLowerCase();

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) < s2.charAt(i)) {
                System.out.println(-1);
                return;
            } else if (s1.charAt(i) > s2.charAt(i)) {
                System.out.println(1);
                return;
            }
        }
        System.out.println(0);

    }
    
}
