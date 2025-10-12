class Solution {
    public int subarraySum(int[] nums, int k) {
        
    Map<Integer, Integer> countMap = new HashMap<>();
    countMap.put(0, 1);
    int prefixSum = 0, count = 0;

    for (int num : nums) {
        prefixSum += num;
        if (countMap.containsKey(prefixSum - k)) {
            count += countMap.get(prefixSum - k);
        }
        countMap.put(prefixSum, countMap.getOrDefault(prefixSum, 0) + 1);
    }

    return count;

    }
}