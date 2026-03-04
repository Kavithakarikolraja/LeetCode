class Solution {
    public void nextPermutation(int[] nums) {
        
        boolean happen = false;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]<=nums[i-1]){
                continue;
            }else{
                happen = true;
                int pos = i-1;
                int swap1 = nums[pos];
                int swap2 = Integer.MAX_VALUE;
                int pos1 =-1;
                

                for(int j=pos+1;j<nums.length;j++){
                    if(swap1<nums[j]&&swap2>=nums[j]){
                        swap2 = nums[j];
                        pos1 = j;
                    }
                }
                if(pos1!=-1){
                nums[pos] = swap2;
                nums[pos1] = swap1;
                reverse(nums, pos+1, nums.length-1);
                }
                  break;
            }

        }
                if(happen==false){
                    reverse(nums,0,nums.length-1);
                }
               
            
        
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}