import java.util.*;

public class solution{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    while(t-- > 0){
        PriorityQueue<Integer> bat = new PriorityQueue<>((a,b)->{
          return b-a;
        });

        PriorityQueue<Integer> bowl = new PriorityQueue<>((a,b)->{
          return b - a;
        });

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 0; i <n;i++){
          int val = sc.nextInt();
          bat.add(val);
        }

        for(int i  = 0; i <m;i++){
          int val = sc.nextInt();
          bowl.add(val);
        }

        if(n >= 4 && m >= 4 && (n+m) >= 11){
          int count = 0;
          long total = 0l;
          while(count < 8){
            total += bat.poll();
            total += bowl.poll();
            count += 2;
          }

          while(count < 10){
            if(bat.size() > 0 && bowl.size() > 0){
              if(bat.peek() >= bowl.peek()){
                total += bat.poll();
                count++;
              }else{
                total += bowl.poll();
                count++;
              }
            }else if(bat.size() > 0){
              total += bat.poll();
              count++;
            }else if(bowl.size() > 0){
              total += bowl.poll();
              count++;
            }
          }

          System.out.println(total);
        }else{
          System.out.println(-1);
        }
    }
  }
}
