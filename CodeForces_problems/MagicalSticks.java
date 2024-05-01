// problem link
// https://codeforces.com/problemset/problem/1371/A

import java.util.*;

public class solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int total = (n-1)/2;
            total++;
            System.out.println(total);
        }
    }
}
