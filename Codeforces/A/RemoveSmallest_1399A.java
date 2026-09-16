package Codeforces.A;
import java.util.*;
public class RemoveSmallest_1399A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                arr.add(sc.nextInt());
            }
            Collections.sort(arr);
            boolean possible = true;
            for (int j = 1; j < n; j++) {
                if (arr.get(j) - arr.get(j - 1) > 1) {
                    possible = false;
                    break;
                }
            }
            if (possible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}