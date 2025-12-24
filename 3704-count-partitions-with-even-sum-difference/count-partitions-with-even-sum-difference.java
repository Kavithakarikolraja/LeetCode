class Solution {
    public int countPartitions(int[] nums) {
        
        int count = 0;
        int start = 0;
        int end = 1;

        while(end<nums.length){
        int sum1 = 0;
        int sum2 = 0;
            for(int i=0;i<=start;i++){
                sum1 += nums[i];
            }
            for(int j=end;j<=nums.length-1;j++){
                sum2 += nums[j];
            }
            count = (((Math.abs(sum1-sum2))&1)==0)? count+1:count;
            start++;
            end++;
        }

        return count;

    }
}