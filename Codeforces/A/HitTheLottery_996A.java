package Codeforces.A;
import java.util.*;
public class HitTheLottery_996A {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] bills = {100, 20, 10, 5, 1};
        int answer = 0;
        
        for (int bill : bills){
            answer += n / bill;
            n %= bill;
        }
        
        System.out.println(answer);
        sc.close();
    }
}
    
