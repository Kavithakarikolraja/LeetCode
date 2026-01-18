class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int[] evenCount = new int[101];
        int[] oddCount = new int[101];
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if ((i&1) == 0) {
                evenCount[nums[i]]++;
            } else {
                oddCount[nums[i]]++;
            }
        }

        int evenNum = 0;
        int oddNum = 100;

        for (int i = 0; i < n; i++) {
            if ((i&1) == 0) {
                while (evenCount[evenNum] == 0) evenNum++;
                nums[i] = evenNum;
                evenCount[evenNum]--;
            } else {
                while (oddCount[oddNum] == 0) oddNum--;
                nums[i] = oddNum;
                oddCount[oddNum]--;
            }
        }

        return nums;
    }
}