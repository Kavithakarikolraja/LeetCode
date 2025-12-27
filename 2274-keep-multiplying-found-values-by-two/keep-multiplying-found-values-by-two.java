class Solution {
    public int findFinalValue(int[] nums, int original) {

        Arrays.sort(nums);
        boolean cond = true;
        
       while(cond){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==original){
                 original *= 2;
                  break;
            }
            if(i==nums.length-1) cond = false;
        }
       }
        return original;
    }
}