import java.util.*;

class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] nums = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) nums[i] = arr[i];

        Arrays.sort(nums, (x, y) -> {
            int bx = Integer.bitCount(x);
            int by = Integer.bitCount(y);
            if (bx == by) return x - y;
            return bx - by;
        });

        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) res[i] = nums[i];
        return res;
    }
}