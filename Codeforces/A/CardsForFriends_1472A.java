package Codeforces.A;
import java.util.Scanner;
public class CardsForFriends_1472A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            int n = sc.nextInt();

            int totalPieces = 1;

            while (w % 2 == 0) {
                w /= 2;
                totalPieces *= 2;
            }
    
            while (h % 2 == 0) {
                h /= 2;
                totalPieces *= 2;
            }

            if (totalPieces >= n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
    
