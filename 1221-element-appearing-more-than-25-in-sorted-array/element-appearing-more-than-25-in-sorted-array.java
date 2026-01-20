class Solution {
    public int findSpecialInteger(int[] arr) {
        
        int val = arr.length/4;

        int[] freq = new int[10000000];

        for(int num : arr){
            freq[num]++;
        }

        for(int i=0;i<arr.length;i++){
            if(freq[arr[i]] >val){
                return arr[i];
            }
        }

        return 0;
    }
}