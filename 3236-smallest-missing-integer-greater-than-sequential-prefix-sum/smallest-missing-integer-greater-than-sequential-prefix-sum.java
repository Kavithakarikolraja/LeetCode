class Solution {
    public int missingInteger(int[] nums) {
        
        int result = 0;
        result += nums[0];
        List<Integer> a = new ArrayList<>();
        for(int v : nums) 
        {
            a.add(v);
        }

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]+1!=nums[i])
            {
                break;
            }
                result += nums[i];
        }

        while(true)
        {
            if(!a.contains(result))
            {
                return result;
            }
            result++;
        }

       // return -1;
    }
}