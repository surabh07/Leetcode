import java.util.*;

class Solution {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();

      int ans = reverse(x);
      System.out.println(ans);
    }
    
    public int reverse(int x) {

        long revx = 0;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        while (x!=0){  
            revx = revx*10 + x%10;
            x = x/10;
        }  

        if(revx<min || revx>max){
            return 0;
        }

        return (int)revx;
    }
}
