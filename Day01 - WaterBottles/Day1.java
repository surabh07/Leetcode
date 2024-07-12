class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drinkable = 0;
        int maxdrinkable = numBottles;
        int empty = 0;

        while(numBottles>0){
            drinkable = numBottles/numExchange;
            maxdrinkable =  maxdrinkable + drinkable;
            empty = numBottles%numExchange;
            numBottles = drinkable+empty;
            if(drinkable==0){
                break;
            }
        }
        return maxdrinkable;
    }
}
