package Codeforces.A;
import java.util.Scanner;
public class BuyTheString_1440A {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int c0 = sc.nextInt();
            int c1 = sc.nextInt();
            int h = sc.nextInt();
            String s = sc.next();
 
            int count0 = 0;
            int count1 = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    count0++;
                } else {
                    count1++;
                }
            }
            
            int costFor0 = Math.min(c0, c1 + h);
            int costFor1 = Math.min(c1, c0 + h);
 
            int totalCost = (count0 * costFor0) + (count1 * costFor1);
            
            System.out.println(totalCost);
        }
        sc.close();
    }
}
    