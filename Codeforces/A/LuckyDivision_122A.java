package Codeforces.A;
import java.util.*;
public class LuckyDivision_122A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] luckynumber = {4, 7, 44, 77, 47, 74, 444, 447, 477, 474, 744, 774, 747, 777};
        
        for(int x : luckynumber) {
            if (n % x == 0) {
                System.out.println("YES");
                return;
            }
        }
        
        System.out.println("NO");
        
    }
}
    

