package Codeforces.A;
import java.util.*;
public class SoldierAndBananas_546A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int InitialCost = sc.nextInt();
        int Money = sc.nextInt();
        int BananasWanted = sc.nextInt();
        
        int TotalCost = 0;
        
        for (int i = 1; i <= BananasWanted; i++){
            TotalCost += (i*InitialCost);
        }
        if (TotalCost > Money){
            int Borrow = TotalCost - Money;
            System.out.println(Borrow);
        } else {
            System.out.println(0);
        }
        
        sc.close();
    }
}
    

