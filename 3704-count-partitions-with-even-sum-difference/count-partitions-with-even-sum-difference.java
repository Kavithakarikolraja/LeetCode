class Solution {
    public int countPartitions(int[] nums) {
        
        int count = 0;
       

      
        int sum1 = 0;
        int sum2 = 0;
            for(int i=0;i<nums.length;i++){
                sum1 += nums[i];
            }
           
        for(int i=0;i<nums.length-1;i++){
            sum1 -= nums[i];
            sum2 += nums[i];

            count = (((Math.abs(sum1-sum2)&1)==0) ? count+1:count);

        }

        return count;

    }
}