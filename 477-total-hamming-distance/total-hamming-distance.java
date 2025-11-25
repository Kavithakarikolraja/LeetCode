class Solution {
    public int totalHammingDistance(int[] nums) {

        Arrays.sort(nums);
        int sum =0;
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                
                int val1 = nums[i];
                int val2 = nums[j];

                int val3 = val1^val2;
                int count = Integer.bitCount(val3);
                sum += count;
            }
        }

        return sum;
    }
}