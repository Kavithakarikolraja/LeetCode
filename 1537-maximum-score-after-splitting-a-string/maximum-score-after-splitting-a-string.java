class Solution {
    public int maxScore(String s) {
        
        int size = s.length();
        int[] prefix_sum = new int[size];

        prefix_sum[0] = Integer.parseInt(String.valueOf(s.charAt(0)));

        for(int i=1;i<size;i++)
        {
            prefix_sum[i] = prefix_sum[i-1]+Integer.parseInt(String.valueOf(s.charAt(i)));
        }

        int max_sum = Integer.MIN_VALUE;

        for(int i=0;i<size-1;i++)
        {
            int ones_sum = prefix_sum[size-1]-prefix_sum[i];
            int zeros_sum = (i+1)-prefix_sum[i];

            int sum = ones_sum + zeros_sum;

            max_sum = Math.max(sum,max_sum);
        }


        return max_sum;
    }
}