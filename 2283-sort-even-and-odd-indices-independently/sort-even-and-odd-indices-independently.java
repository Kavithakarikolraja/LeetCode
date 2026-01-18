class Solution {
    public int[] sortEvenOdd(int[] nums) {

        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                evens.add(nums[i]);
            } else {
                odds.add(nums[i]);
            }
        }

        Collections.sort(evens); 
        odds.sort(Collections.reverseOrder()); 
        int e = 0, o = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = evens.get(e++);
            } else {
                nums[i] = odds.get(o++);
            }
        }

        return nums;

    }
}