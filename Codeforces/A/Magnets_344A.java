package Codeforces.A;
import java.util.*;
public class Magnets_344A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String previous = "";
        int count = 0;
        
        for (int i = 0; i < n; i++){
            String current = sc.next();
            
            if (!current.equals(previous)){
                count++;
            }
            
            previous = current;
        }
        
        System.out.println(count);
    }
}
    

