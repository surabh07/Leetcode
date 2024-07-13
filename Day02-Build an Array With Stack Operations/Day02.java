import java.util.*;

class Solution {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();

    int[] target = new int[m];

     for (int i=0;i<m;i++){
          target[i] = sc.nextInt();
     }
    
     int n = sc.nextInt();

    ArrayList <String> result = buildArray(target, n);
        for(String operation : result) {
            System.out.println(operation);
        }
  }

  public static ArrayList<String> buildArray(int[] target, int n) {
      
      int[] stream = new int[n];
      ArrayList <Integer> al = new ArrayList<>();

      for(int i : target){
          al.add(i);
      }

      for(int i=0;i<n;i++){
          if(i==0){
              stream[i] = 1;
          }
          else{
              stream[i] = stream[i-1] + 1;
          }
      }

      ArrayList <String> stackops = new ArrayList<>();
      int m = al.size();
      int count = 0;

      for(int i : stream){
          if(al.contains(i)){
              stackops.add("Push");
              count++;
          }
          else{
              stackops.add("Push");
              stackops.add("Pop");
          }
          if(m==count){
              break;
          }
      }
  return stackops;
  }
}
