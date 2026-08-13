class Solution {
    public int maxSubarrayLength(int[] nums, int k) {

        if(k==1 && nums.length==1) return 1;
        
        int i = 0;
        int j = 0;
        int maxLength = 0;
        Map<Integer,Integer> a = new HashMap<>();
        boolean found = true;
        while(j<nums.length)
        {
        
            if(a.containsKey(nums[j])&&a.get(nums[j])<k)
            {
                a.put(nums[j],a.getOrDefault(nums[j],0)+1);
                j++;
            }
            else if(!a.containsKey(nums[j]))
            {
               a.put(nums[j],a.getOrDefault(nums[j],0)+1);
                j++;
            }
            else
            {
                found = false;
                maxLength = Math.max(maxLength,j-i);
                int val = a.get(nums[i])-1;
                a.put(nums[i],val);
                i++;

            }

        }

         maxLength = Math.max(maxLength,j-i);

        if(found) return nums.length;

        return maxLength;
    }
}