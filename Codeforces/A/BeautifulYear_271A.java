package Codeforces.A;
import java.util.*;
public class BeautifulYear_271A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();

        while (true) {
            y++;

            String year = String.valueOf(y);
            boolean beautiful = true;

            for (int i = 0; i < year.length(); i++) {
                for (int j = i + 1; j < year.length(); j++) {
                    if (year.charAt(i) == year.charAt(j)) {
                        beautiful = false;
                    }
                }
            }

            if (beautiful) {
                System.out.println(y);
                break;
            }
        }
    }
}
    

