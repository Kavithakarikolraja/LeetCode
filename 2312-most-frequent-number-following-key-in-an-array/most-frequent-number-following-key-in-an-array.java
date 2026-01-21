class Solution {
    public int mostFrequent(int[] nums, int key) {

        
        int[] freq = new int[100001];

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==key){
                freq[nums[i+1]]++;
            }
        }

        int max = 0;
        int res = -1;

        for(int i=0;i<freq.length;i++){
            if(freq[i]>max){
                max = freq[i];

                res = i;
            }
        }

        return res;
    }
}