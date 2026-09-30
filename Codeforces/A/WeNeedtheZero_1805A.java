package Codeforces.A;
import java.util.*;
public class WeNeedtheZero_1805A {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            
            int x = 0;
            
            if (n % 2 != 0){
                for (int i = 0; i < n; i++){
                    x = x ^ a[i];
                }
            }
            else{
                for (int i = 0; i < n; i++){
                    x = x ^ a[i];
                }
                
                if (x == 0){
                    x = 0;
                } else {
                    x = -1;
                }
            }
            System.out.println(x);
        }
        sc.close();
    }
}