class Solution {
    public int maxRotateFunction(int[] nums) {
        int n;
		n = nums.length;
        if(n==1) return 0;
		int[] sum_of_all_ele = new int[n]; // store all  value in an element
		int sum ;
		int max; // detect the maximum value
		int actual; //store the sum each time 
		int ind;
		sum = 0;
		actual = 0;
		//max = Integer.MIN_VALUE;
		
		// finding sum
		
		for(int val : nums)
		{
		  sum += val;	
		}
		
		// filling the array of sum_of_all_ele  && first rotation value;
		
		for(ind = 0; ind < n; ind++)
		{
		  sum_of_all_ele[ind] = sum - nums[ind];	
		  actual += nums[ind]*ind;
		}
		
		max = actual;
		
		for(ind = n-1 ; ind > 0; ind--)
		{
			int val = ((actual - (nums[ind] * (n-1))) + sum_of_all_ele[ind]); 
			
			max = Math.max(max,val);
			actual = val;
		}
		
		return max;
    }
}