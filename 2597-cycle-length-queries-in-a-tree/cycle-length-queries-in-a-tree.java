class Solution {
    public int[] cycleLengthQueries(int n, int[][] queries) {

      
        int[] counter = new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            int count = 1;
            
                int val1 = queries[i][0];
                int val2 = queries[i][1];

                while(val1!=val2)
                {
                    if(val1>val2)
                    {
                        val1 /=2;
                        count++;
                    }
                    else
                    {
                        val2 /=2;
                        count++;
                    }
                }
            
            counter[i] = count;
        }

        return counter;
    }
}