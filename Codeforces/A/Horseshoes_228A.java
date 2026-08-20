package Codeforces.A;

import java.util.Scanner;
import java.util.HashSet;

public class Horseshoes_228A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();

        set.add(a);
        set.add(b);
        set.add(c);
        set.add(d);

        System.out.println(4 - set.size());
    }
}