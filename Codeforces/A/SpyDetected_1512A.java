package Codeforces.A;
import java.util.Scanner;
public class SpyDetected_1512A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
 
            int commonValue;
            if (a[0] == a[1]) {
                commonValue = a[0];
            } else if (a[0] == a[2]) {
                commonValue = a[0];
            } else {
                commonValue = a[1];
            }
            
            for (int i = 0; i < n; i++) {
                if (a[i] != commonValue) {
                    System.out.println(i + 1); // +1 for 1-based indexing
                    break;
                }
            }
        }
        sc.close();
    }
}