class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        
       /* Set<Integer> a = new HashSet<>();

        for(int n : nums2)
        {
            a.add(n);
        } 

        for(int n : nums1)
        {
            if(a.contains(n)) return n;
        }

        return -1;*/



         int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] == nums2[j]) {
                return nums1[i];
            }

            if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return -1;
    }
}