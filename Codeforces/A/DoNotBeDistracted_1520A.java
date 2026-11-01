package Codeforces.A;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class DoNotBeDistracted_1520A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            if (isValidOrder(s, n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
 
    private static boolean isValidOrder(String s, int n) {
        
        Set<Character> visited = new HashSet<>();
 
        visited.add(s.charAt(0));
        
        for (int i = 1; i < n; i++) {
            char currentTask = s.charAt(i);
            char prevTask = s.charAt(i - 1);
 
            if (currentTask != prevTask) {
                if (visited.contains(currentTask)) {
                    return false;
                }
                visited.add(currentTask);
            }
        }
        return true;
    }
}