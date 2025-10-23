class Solution {
    public int findShortestSubArray(int[] nums) {
        int[] freq = new int[50001]; 
        int maxFreq = 0;

       
        for (int n : nums) {
            freq[n]++;
            maxFreq = Math.max(maxFreq, freq[n]);
        }

        int minLength = nums.length;

        
        for (int val = 0; val < freq.length; val++) {
            if (freq[val] == maxFreq) {
                int first = -1, last = -1;
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] == val) {
                        if (first == -1) first = i;
                        last = i;
                    }
                }
                minLength = Math.min(minLength, last - first + 1);
            }
        }

        return minLength;
    }
}