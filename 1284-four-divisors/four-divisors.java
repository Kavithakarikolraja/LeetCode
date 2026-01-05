class Solution {
    public int sumFourDivisors(int[] nums) {
        int count = 0; 
        for (int i = 0; i < nums.length; i++) {
            int temp = 0;  
            int val = 0;   
            int n = nums[i];

            
            for (int j = 1; j * j <= n; j++) {
                if (n % j == 0) {
                    temp++;
                    val += j;
                    if (j != n / j) { 
                        temp++;
                        val += n / j;
                    }
                }
                if (temp > 4) break; 
            }

           
            if (temp == 4) {
                count += val;
            }
        }
        return count;
    }
}