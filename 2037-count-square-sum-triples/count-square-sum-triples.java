class Solution {
    public int countTriples(int n) {

        int count = 0;

        for(int i=1;i<=n;i++){
           for(int j=1;j<=n;j++){
            int c2 = i*i+j*j;
            int val = (int)Math.sqrt(c2);
            if(val<=n && val*val == c2) count++;
           }
        }

        return count;
    }
}