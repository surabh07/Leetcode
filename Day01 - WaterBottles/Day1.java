import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numBottles = sc.nextInt();
        int numExchange = sc.nextInt();

        int ans = numWaterBottles(numBottles, numExchange);
        System.out.println(ans);
    }

    public static int numWaterBottles(int numBottles, int numExchange) {
        int drinkable = 0;
        int maxdrinkable = numBottles;
        int empty = 0;

        while(numBottles > 0) {
            drinkable = numBottles / numExchange;
            maxdrinkable =  maxdrinkable + drinkable;
            empty = numBottles % numExchange;
            numBottles = drinkable + empty;
            if(drinkable == 0) {
                break;
            }
        }
        return maxdrinkable;
    }
}
