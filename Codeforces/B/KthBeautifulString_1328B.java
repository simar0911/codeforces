package Codeforces.B;
import java.util.*;
import java.io.*;
public class KthBeautifulString_1328B {
    
    public static void main(String[] args) throws IOException {
         Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int firstB = n - 2;

            while (k > n - firstB - 1) {
                k -= (n - firstB - 1);
                firstB--;
            }

            int secondB = n - k;

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < n; i++) {
                if (i == firstB || i == secondB) {
                    sb.append('b');
                } else {
                    sb.append('a');
                }
            }

            System.out.println(sb);
        }
    }
}