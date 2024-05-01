// problem link
// https://codeforces.com/problemset/problem/1294/A

import java.util.*;

public class solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n;
            int[] arr = new int[3];

            for(int i = 0; i < 3;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            n = sc.nextInt();

            int val = arr[2] - arr[0];
            val += arr[2] - arr[1];


            if(n >= val){
                n -= val;
                if(n % 3 == 0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }else{
                System.out.println("NO");
            }
        }
    }
}
