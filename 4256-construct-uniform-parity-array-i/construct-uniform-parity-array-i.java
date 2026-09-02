class Solution {
    public boolean uniformArray(int[] nums1) {

        int nof  = nums1.length;
       if(nof<1) return false;

        boolean odd = false;

        for(int n : nums1){
            if((Math.abs(n)&1)==1){
                odd =true;
                break;
            }
        }


        return odd || possibleofeven(nums1);
    }


    private boolean possibleofeven(int[] nums1){
        int oddc = 0;
        int evenc = 0;

        for(int n: nums1){
            if((n&1)==1) oddc++;
            else evenc++;
        }

        if(oddc>0 && oddc<2 && evenc>0){
            return false;
        }

        return true;
    }
}