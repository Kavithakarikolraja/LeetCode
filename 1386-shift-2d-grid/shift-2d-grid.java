class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int front;
        while(k>0)
        {
            if(grid[0].length>1)
            {
            for(int i=grid.length-1;i>=0;i--)
            {
                front = grid[i][grid[i].length-1];
                for(int j=grid[i].length-1;j>0;j--)
                {
                    grid[i][j] = grid[i][j-1];
                }

                grid[i][0] = front;
            }
            }

            front = grid[grid.length-1][0];
                for(int i=grid.length-1;i>0;i--)
                {
                    grid[i][0] = grid[i-1][0];
                }

                grid[0][0] = front;

                k--;
            
        }

        List<List<Integer>> a = new ArrayList<>(); 

        for(int i=0;i<grid.length;i++)
        {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0;j<grid[i].length;j++)
            {
                temp.add(grid[i][j]);
            }

            a.add(new ArrayList<Integer>(temp));
        }

        return a;
    }
}