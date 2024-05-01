// problem link
// https://codeforces.com/problemset/problem/1742/B

import java.util.*;

public class solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i <n;i++){
                arr[i] = sc.nextInt();
            }

            Set<Integer> s = new HashSet<>();

            for(int i : arr){
                s.add(i);
            }

            if(s.size() == n){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
