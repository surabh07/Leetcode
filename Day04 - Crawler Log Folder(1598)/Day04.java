import java.util.*;

class Solution {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String logs = sc.nextLine();

      int ans = minOperations(logs);
      System.out.println(ans);
    }
    public static int minOperations(String[] logs) {
        int depth = 0;
        int n = logs.length;

        for(int i=0;i<n;i++){
            if(logs[i].equals("./")){
                continue;
            }
            else if(logs[i].equals("../")){
                depth--;
                if(depth<0){
                    depth = 0;
                }
            }
            else{
                depth++;
            }
        }
        return depth;
    }
}
