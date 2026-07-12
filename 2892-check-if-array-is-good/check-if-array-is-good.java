class Solution {
    public boolean isGood(int[] nums) {

        Arrays.sort(nums);

        int max = nums[nums.length-1];

        if(max+1 != nums.length) return false;

       for(int i=0;i<nums.length-2;i++)
       {
        if(nums[i]!=i+1) return false;
       }

       return true;
        
    }
}