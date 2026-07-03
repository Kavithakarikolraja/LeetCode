class Solution {
    public int countDistinctIntegers(int[] nums) {
        
        HashSet<Integer> a = new HashSet<>();

        for(int i=0;i<nums.length;i++)
        {
            a.add(nums[i]);
        }

        for(int i=0;i<nums.length;i++)
        {
            int val = reverse(nums[i]);
            a.add(val);
        }

        return a.size();
    }

    public int reverse(int val)
    {
        int sum = 0;

        while(val>0)
        {
            int rem = val%10;
            sum = sum*10 + rem;
            val /= 10;
        }
        return sum;
    }
}