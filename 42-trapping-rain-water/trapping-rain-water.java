class Solution {
    public int trap(int[] height) {

        if(height.length==1) return 0;

        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int max ;

        max = height[0];

        for(int i=0;i<height.length;i++)
        {
            if(max<height[i])
            {
                left[i] = height[i];
                max = height[i];
            }else
            {
                left[i] = max;
            }
        }

        max = height[height.length-1];

         for(int i=height.length-1;i>=0;i--)
        {
            if(max<height[i])
            {
                right[i] = height[i];
                max = height[i];
            }else
            {
                right[i] = max;
            }
        }

        int res = 0;

        for(int i=0;i<height.length;i++)
        {
            res +=  Math.min(left[i],right[i]) -height[i];
        }

        return res;
        
    }
}