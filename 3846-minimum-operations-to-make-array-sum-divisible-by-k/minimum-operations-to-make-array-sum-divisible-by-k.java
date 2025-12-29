class Solution {
    public int minOperations(int[] nums, int k) {

        int sum = 0;
        
        for(int num:nums) sum += num;

        int ans = (sum%k==0) ? 0 : sum%k;

        return (sum%k==0) ? 0 : sum%k;
    }
}