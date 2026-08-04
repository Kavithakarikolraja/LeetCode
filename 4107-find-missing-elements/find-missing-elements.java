class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        Arrays.sort(nums);
        int start = nums[0];
        List<Integer> a = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(start != nums[i]) {
                a.add(start);
                i--;
               
            }
            start++;
        }

       return a; 
    }
}