class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] inDeg = new int[n+1];
        int[] outDeg =  new int[n+1];

        for(int ind = 0 ; ind < trust.length ; ind++)
        {
            int src = trust[ind][0];
            int dest = trust[ind][1];
            outDeg[src]++;
            inDeg[dest]++;
        }

        for(int ind = 1 ; ind < n +1 ; ind++)
        {
            if(outDeg[ind] == 0 && inDeg[ind] == n-1)
            {
                return ind;
            }
        }
        return -1;
    }
}