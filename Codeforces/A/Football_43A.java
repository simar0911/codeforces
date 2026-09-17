package Codeforces.A;
import java.util.*;
public class Football_43A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        
        for (int i=0; i<n; i++){
            arr[i] = sc.next();
        }
        
        int goal1 = 0;
        int goal2 = 0;
        
        String team1 = arr[0];
        String team2 = "";
        
        for(int i=0; i<n; i++){
            if(arr[i].equals(team1)){
                goal1++;
            }
            else{
                goal2++;
                team2 = arr[i];
            }
        }
        if(goal1 > goal2){
            System.out.println(team1);
        }
        else{
            System.out.println(team2);   
        }
            
        sc.close();
    }
}
    

