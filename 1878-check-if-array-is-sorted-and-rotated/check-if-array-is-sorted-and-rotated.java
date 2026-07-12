class Solution {
    public boolean check(int[] nums) {
        int countDrops = 0;

        for (int i = 0; i < nums.length; i++) {
            int next = nums[(i + 1) % nums.length]; 
            if (nums[i] > next) {
                countDrops++;
            }
            if (countDrops > 1) return false;
        }

        return true;
    }
}
  