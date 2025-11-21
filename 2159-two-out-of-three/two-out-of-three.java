class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();
        for(int num:nums1) {
            a.add(num);
        }
         for(int num:nums2) {
            b.add(num);
        }
         for(int num:nums3) {
            c.add(num);
        }

        int[] val = new int[101];

        for (int num : a) val[num]++;
        for (int num : b) val[num]++;
        for (int num : c) val[num]++;


        List<Integer> re = new ArrayList<>();

        for(int i=0;i<val.length;i++){
              if(val[i]>=2) re.add(i);
        }


        return re;
    }
}