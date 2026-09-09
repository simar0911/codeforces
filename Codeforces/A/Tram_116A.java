package Codeforces.A;
import java.util.*;
public class Tram_116A {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int people = 0;
        int maximum = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            people = people - a;
            people = people + b;

            maximum = Math.max(maximum, people);
        }

        System.out.println(maximum);
    }
}
    
