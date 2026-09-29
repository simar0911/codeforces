package Codeforces.A;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class LoveStory_1829A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int t = Integer.parseInt(st.nextToken());
        String target = "codeforces";
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            String s = br.readLine();
            int diffCount = 0;
            for (int i = 0; i < 10; i++) {
                if (s.charAt(i) != target.charAt(i)) {
                    diffCount++;
                }
            }
            sb.append(diffCount).append("\n");
        }
        System.out.print(sb);
    }
}
    