class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;
        boolean[][] visited = new boolean[m][n];
		
		int[][] directions = {{-1,0},{1,0},{0,-1},{0,1}};
		int orgColor = image[sr][sc];
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[]{sr,sc});
		visited[sr][sc] = true;
		image[sr][sc] = color;
		
		while(!q.isEmpty())
		{
			int[] curr = q.poll();
			
			int row = curr[0];
			int column = curr[1];
			
			for(int i=0;i<directions.length;i++)
			{
				int newRow = row+directions[i][0];
				int newColumn = column+directions[i][1];
				
				if(newRow >=0 && newRow < image.length && newColumn >=0 && newColumn < image[0].length && !visited[newRow][newColumn])
				{
					
					if(image[newRow][newColumn] == orgColor)
					{
						image[newRow][newColumn] = color;
						q.add(new int[]{newRow,newColumn});
						visited[newRow][newColumn] = true;
					
					}
				}
			}
		}

        return image;
		
    }
}