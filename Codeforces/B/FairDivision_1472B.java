package Codeforces.B;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class FairDivision_1472B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int count = 0;
            int count2 = 0;
            int totalWeight = 0;
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                int weight = Integer.parseInt(st.nextToken());
                totalWeight += weight;
                if (weight == 1) {
                    count++;
                } else {
                    count2++;
                }
            }

            if (totalWeight % 2 != 0) {
                sb.append("NO\n");
            } else {
                if (count2 % 2 == 0) {
                    sb.append("YES\n");
                } else {
                    if (count >= 2) {
                        sb.append("YES\n");
                    } else {
                        sb.append("NO\n");
                    }
                }
            }
        }
        System.out.print(sb);
    }
}
    
