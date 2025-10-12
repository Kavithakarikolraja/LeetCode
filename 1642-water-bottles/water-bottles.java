class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        
       int  count = numBottles;
       int empty = numBottles;

       while(empty>=numExchange){
        int fill = empty/numExchange;
        count += fill;
        empty = empty % numExchange+fill;

       }

 return count;
    }
}