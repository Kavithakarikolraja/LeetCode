class Solution {
    int[][] direction = {{1,0},{-1,0},{0,1},{0,-1}};
    int m,n;
    int[][] memo ;
    public int longestIncreasingPath(int[][] matrix) {
        
        m = matrix.length;
        n = matrix[0].length;
        memo = new int[m][n];

        int ans = 0;

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                ans = Math.max(ans,dfs(matrix,i,j));
            }
        }

        return ans;
    }

    public int dfs(int[][] matrix,int i,int j)
    {
        if(memo[i][j]!=0) return memo[i][j];

        int max = 1;

        for(int[] d : direction)
        {
            int x = i+d[0] ;
            int y = j+d[1];

            if(x>=0 && x<m && y>=0 && y<n && matrix[i][j]<matrix[x][y])
            {
                max = Math.max(max,1+dfs(matrix,x,y));
            }
        }

        memo[i][j] = max;
        return max;
    }
}