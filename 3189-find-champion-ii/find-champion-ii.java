class Solution {
    public int findChampion(int n, int[][] edges) {
        
        int[] inDeg = new int[n];

        for(int i=0;i<edges.length;i++)
        {
            inDeg[edges[i][1]]++;
        }

        int inDegValue = -1;
        int count = 0;

        for(int i=0;i<n;i++)
        {
            if(inDeg[i]==0)
            {
                count++;
                inDegValue = i;
            }
        }

       // System.out.println(count);
        if(count>1)
        {
            return -1;
        }

        return inDegValue;
    }
}