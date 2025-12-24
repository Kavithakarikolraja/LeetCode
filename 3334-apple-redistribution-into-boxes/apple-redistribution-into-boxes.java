class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        

        int total = 0;
        int count = 0;

        for(int apples :apple){
            total += apples;
        }

        Arrays.sort(capacity);
        

       for(int i=capacity.length-1;i>=0;i--){
            count++;
            total -= capacity[i];
            if(total<=0){
                return count;
            }
        }

        return 0;
    }
}