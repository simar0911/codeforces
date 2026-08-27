package Codeforces.A;
import java.util.*;
public class Sum_1742A {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int d = sc.nextInt();
        
        while (d-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            if (a == b + c || b == a + c || c == a + b){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}