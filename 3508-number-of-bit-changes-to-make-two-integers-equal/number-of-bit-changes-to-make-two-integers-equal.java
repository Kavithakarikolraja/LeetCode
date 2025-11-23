class Solution {
    public int minChanges(int n, int k) {

        if ((n | k) != n) {
            return -1;
        }

       
        int diff = n ^ k;  
        return Integer.bitCount(diff); 

    }
}