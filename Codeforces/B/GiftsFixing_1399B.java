package Codeforces.B;
import java.util.*; 
public class GiftsFixing_1399B {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for (int test = 0; test < t; test++){
            
            int n = sc.nextInt();
            
            int[] a = new int[n];
            int[] b = new int[n];
            
            for (int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            
            for (int i = 0; i < n; i++){
                b[i] = sc.nextInt();
            }
            
            int minA = a[0];
            int minB = b[0];
            
            for (int i = 1; i < n; i++){
                minA = Math.min(minA, a[i]);
                minB = Math.min(minB, b[i]);
            }
            long ans = 0;
            
            for (int i = 0; i < n; i++){
                int candy = a[i] - minA;
                int orange = b[i] - minB;
 
                int both = Math.min(candy, orange);
 
                candy = candy - both;
                orange = orange - both;
 
                ans += both + candy + orange;
            }
            
            System.out.println(ans);
        }
        
        sc.close();
    }
}