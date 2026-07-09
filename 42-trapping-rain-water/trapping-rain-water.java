class Solution {
    public int trap(int[] height) {

        int size = height.length;
        if(size==1) return 0;

        int[] left = new int[size];
        int[] right = new int[size];
        int max ;

        max = height[0];

        for(int i=0;i<size;i++)
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

        max = height[size-1];

         for(int i=size-1;i>=0;i--)
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

        for(int i=0;i<size;i++)
        {
            res +=  Math.min(left[i],right[i]) -height[i];
        }

        return res;
        
    }
}