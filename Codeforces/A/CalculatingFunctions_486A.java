package Codeforces.A;
import java.util.*;
public class CalculatingFunctions_486A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLong()) {
            long n = sc.nextLong();
            if (n % 2 == 0) {
                System.out.println(n / 2);
            } else {
                System.out.println(-(n + 1) / 2);
            }
        }
        sc.close();
    }
}
    
