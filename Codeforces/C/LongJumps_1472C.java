package Codeforces.C;
import java.util.Scanner;
public class LongJumps_1472C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n + 1];
            
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextLong();
            }
            
            long maxScore = 0;

            for (int i = n; i >= 1; i--) {
                if (i + a[i] <= n) {
                    a[i] += a[(int)(i + a[i])];
                }
                maxScore = Math.max(maxScore, a[i]);
            }
            System.out.println(maxScore);
        }
    }
}