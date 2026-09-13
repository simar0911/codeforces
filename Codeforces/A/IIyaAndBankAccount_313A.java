package Codeforces.A;
import java.util.*;
public class IIyaAndBankAccount_313A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        if (n >= 0){
            System.out.println(n);
        } else {
            long a = n / 10;
            long b = (n / 100) * 10 + n % 10;
            
            System.out.println(Math.max(n, Math.max(a, b)));
        }
        sc.close();
    }
}