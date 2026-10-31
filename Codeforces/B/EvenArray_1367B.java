package Codeforces.B;
import java.util.Scanner;
public class EvenArray_1367B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            
            int wrongEven = 0;
            int wrongOdd = 0;
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
 
                if (i % 2 != a[i] % 2) {
                    if (i % 2 == 0) {
                        wrongEven++;
                    } else {
                        wrongOdd++;
                    }
                }
            }
            if (wrongEven == wrongOdd) {
                System.out.println(wrongEven);
            } else {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}
    
