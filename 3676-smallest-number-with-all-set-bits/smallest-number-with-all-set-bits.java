class Solution {
    public int smallestNumber(int n) {

    if(n==1) return 1;
        
     
     for(int i=0;i<n;i++){

        int val = (int)Math.pow(2,i);

        if(val-1>=n){
            return val-1;
        }

     }

     return 0;

    }
}