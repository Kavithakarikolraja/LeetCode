class Solution {
    public boolean uniformArray(int[] nums1) {

        int nof = nums1.length;
        if(nof==0) return true;

        int min = nums1[0];
        for(int n : nums1){
            if(n<min) min = n;
        }

        if((min &1)==1) return true;



        for(int n : nums1){
            if((n&1)==1) return false;
        }

        return true;
    }
}