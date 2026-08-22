package Codeforces.A;
import java.util.*;
 public class Perfectpermutation_233A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        if (n % 2 == 1) {
            System.out.println(-1);
        } else {
            for (int i = 1; i<= n; i += 2) {
                System.out.println((i + 1) + " " + i + " " );
                
            }
        }
        sc.close();
    }
}
 
    

