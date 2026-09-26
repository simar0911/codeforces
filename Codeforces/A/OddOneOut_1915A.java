package Codeforces.A;
import java.io.*;
import java.util.*;
public class OddOneOut_1915A {
  
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());
        
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            
            int uniqueValue = a ^ b ^ c;
            
            sb.append(uniqueValue).append("\n");
        }
        System.out.print(sb);
    }
}
}