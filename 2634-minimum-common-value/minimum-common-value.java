class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        
        Set<Integer> a = new HashSet<>();

        for(int n : nums2)
        {
            a.add(n);
        } 

        for(int n : nums1)
        {
            if(a.contains(n)) return n;
        }

        return -1;
    }
}