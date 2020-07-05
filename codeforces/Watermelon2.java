import java.util.*;

import java.util.*;

/*
https://codeforces.com/problemset/problem/4/A
*/
 
public class Watermelon2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if(x < 4) {
            System.out.println("NO");
            return;
        }
        if((x - 2) % 2 == 0) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
