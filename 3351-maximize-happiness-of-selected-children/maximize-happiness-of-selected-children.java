class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {

        Arrays.sort(happiness);
        
        long count = 0;
        long seq = 0;

        for(int i=happiness.length-1;i>=0;i--){
            if(happiness[i]-seq<=0) return count;
            else count += happiness[i]-seq;
           seq++;
           k--;

           if(k==0) return count;
}
return 0;
    }
}