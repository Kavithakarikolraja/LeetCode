class Solution {
    public int[] replaceElements(int[] arr) {
        
        int[] ans = new int[arr.length];

        ans[arr.length-1] = -1;
        int max = -1;

        for(int i=arr.length-1;i>0;i--){
            if(arr[i]>max){
                ans[i-1] = arr[i];
                max = arr[i];
            }else{
                ans[i-1] = max;
            }
        }

        return ans;
    }
}